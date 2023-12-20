package com.wedevol.emptyspringrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Entry Point class
 *
 * @author Charz++
 */

@SpringBootApplication
@EnableSwagger2
public class EntryPoint extends SpringBootServletInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(EntryPoint.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EntryPoint.class);
    }

    public static void main(String[] args) {
        LOG.info("Initializing Spring Boot!");
        SpringApplication.run(EntryPoint.class, args);
    }

    @Bean
	public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("com.wedevol.emptyspringrest")).build();
	   }
}
