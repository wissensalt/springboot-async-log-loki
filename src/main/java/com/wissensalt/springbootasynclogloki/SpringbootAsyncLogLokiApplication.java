package com.wissensalt.springbootasynclogloki;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@SpringBootApplication
public class SpringbootAsyncLogLokiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAsyncLogLokiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Logging... INFO");
		log.error("Logging... ERROR");
		log.warn("Logging... WARN");
		log.debug("Logging... DEBUG");
	}

	@GetMapping("/")
	public String helloWorld() {
		log.info("Hello World..!");

		return "Hello World";
	}
}
