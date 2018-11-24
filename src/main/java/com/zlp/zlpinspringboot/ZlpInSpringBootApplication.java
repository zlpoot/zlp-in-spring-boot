package com.zlp.zlpinspringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * test
 */
@SpringBootApplication
public class ZlpInSpringBootApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZlpInSpringBootApplication.class)
				.run(args);
//		SpringApplication.run(ZlpInSpringBootApplication.class, args);

	}
}
