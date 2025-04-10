package com.upeu.ms_pedidos.config;

import org.springframework.context.annotation.Bean;

public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("OPEN API MICROSERVICIO PEDIDOS")
                        .version("0.0.1")
                        .description("Servicios web pedidos")
                        .termsOfService("http://swagger.io/terms")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                );
    }
}
