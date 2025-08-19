package ca.alberta.gov.staffdirectory.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * OpenAPI 3.0 configuration for API documentation
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI albertaStaffDirectoryOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Alberta Staff Directory API")
                        .description("Modern REST API for Alberta Government Staff Directory. " +
                                   "This API provides READ-ONLY access to staff directory data, " +
                                   "maintaining full compatibility with the legacy ICEfaces application.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Government of Alberta")
                                .url("https://www.alberta.ca"))
                        .license(new License()
                                .name("Government of Alberta License")
                                .url("https://www.alberta.ca/copyright.aspx")))
                .servers(List.of(
                        new Server()
                                .url("http://localhost:8080/api")
                                .description("Development Server"),
                        new Server()
                                .url("http://localhost:8080/api")
                                .description("Docker Development Server")
                ));
    }
}