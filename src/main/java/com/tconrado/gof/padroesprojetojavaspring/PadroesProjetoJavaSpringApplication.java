package com.tconrado.gof.padroesprojetojavaspring;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

/**
 * Projeto Spring Boot gerado via Spring Initializer
 * Os seguintes módulos foram importados:
 * Spring Web
 * Spring Data JPA
 * H2 Database
 * OpenFeign
 * Open API
 *
 * @author Thalyta09
 */

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoJavaSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(PadroesProjetoJavaSpringApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenApi(@Value("${application-description}") String appDescription,
								 @Value("${application-version}") String appVersion) {

		return new OpenAPI()
				.info(new Info()
						.title("Exemplo Simples de API")
						.version(appVersion)
						.description(appDescription)
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.servers(Collections.singletonList(new Server().url("http://localhost:8080/v3/api-docs").description("URL base")))
				.externalDocs(new ExternalDocumentation().description("Saiba mais").url("http://swagger.io"));
	}

}
