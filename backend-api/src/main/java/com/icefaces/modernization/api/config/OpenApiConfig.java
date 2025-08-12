package com.icefaces.modernization.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI/Swagger Configuration
 * Provides comprehensive API documentation for the modernized ICEfaces application
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("ICEfaces Modernization API")
                        .description("REST API for modernized ICEfaces application - replacing legacy JSF with Spring Boot")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("ICEfaces Modernization Team")
                                .email("support@icefaces-modernization.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8081")
                                .description("Development Server"),
                        new Server()
                                .url("https://api.icefaces-modernization.com")
                                .description("Production Server")
                ));
    }
}