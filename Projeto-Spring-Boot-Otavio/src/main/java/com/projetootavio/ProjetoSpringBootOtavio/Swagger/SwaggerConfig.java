package com.projetootavio.ProjetoSpringBootOtavio.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;



@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.projetootavio.ProjetoSpringBootOtavio"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .apiInfo(metaInfo());

    }


    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "API-REST",
                "Api para gerenciamento de ponto de acesso",
                "1.0.0",
                "Terms of Service",
                new Contact("Otávio Messias Lemos de Sousa", "https://github.com/http-otavio", "otavio.mlemos20@gmail.com"),
                "Apache License Version 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }

}

