package com.upeu.ms_pedidos.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
//spring cloud cofig serve para gestion centralizada
//euroeka server para resgitros de descubrimiento
//spring cloud gateway para enrutar
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
