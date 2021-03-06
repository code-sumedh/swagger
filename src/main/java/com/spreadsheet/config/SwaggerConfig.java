package com.spreadsheet.config;

import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.springboot.swaggerexample")).paths(regex("/rest.*"))
				.build().apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {

		return new ApiInfoBuilder().title("Spring Boot Swagger Example API")
				.description("Spring Boot Swagger Example API for Linkedin")
				.contact(new Contact("Sumedh Kulkarni", "https://www.linkedin.com/in/sumedh-kulkarni/",
						"sumedhkulkarni18@gmail.com"))
				.license("Apache License Version 2.0").licenseUrl("https://www.apache.org/licesen.html").version("1.0")
				.build();

	}
}
