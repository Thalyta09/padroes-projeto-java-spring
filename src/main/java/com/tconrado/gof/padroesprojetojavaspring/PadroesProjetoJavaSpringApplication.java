package com.tconrado.gof.padroesprojetojavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializer
 * Os seguintes módulos foram importados:
 * Spring Web
 * Spring Data JPA
 * H2 Database
 * OpenFeign
 *
 * @author Thalyta09
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoJavaSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PadroesProjetoJavaSpringApplication.class, args);
	}

}
