package com.example.SmatRentalPro_API.SwaggerConfig;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "SmatProp",
                        email = "letinashe.chiyangwa@gmail.com",
                        url = "https://www.smatprop.com/"
                ),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi specification - Iserve API",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://www.smatprop.com/"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://www.smatprop.com/"
                )
        }
)

public class OpenApiConfig {
}
