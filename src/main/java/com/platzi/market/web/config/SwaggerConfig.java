package com.platzi.market.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
// @EnableSwagger2 This is needed to show the documentation, but right now swagger is not compatible with java 17
public class SwaggerConfig {
    // Here we create a bean that is going to return a docket with the documentation of our API
    // To see the documentation visit: http://localhost:8090/platzi-market/api/swagger-ui.html
    // We select the endpoints to be presented in the HTML
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.platzi.market.web.controller")) // The selection of our controllers
                .build();
    }
}
