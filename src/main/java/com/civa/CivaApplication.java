package com.civa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CivaApplication {

	/**
	 * Swagger UI - Documentation para que puedan probar los enpoints
	 * http://localhost:8090/v1/api/swagger-ui/index.html
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CivaApplication.class, args);
	}

}
