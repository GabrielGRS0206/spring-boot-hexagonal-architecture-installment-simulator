package br.com.io.github.grochase.adpters.in.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openAPI() {
    var contact = new Contact();
    contact.setName("Gabriel Rocha Severino");
    contact.setUrl("https://github.com/GabrielGRS0206");
    contact.setEmail("gabrielrocha0206@gmail.com");

    return new OpenAPI()
        .info(
            new Info()
                .title("Spring Hexagonal Architecture - App Payments")
                .version("1.0")
                .description("payments")
                .contact(contact))
        .externalDocs(
            new ExternalDocumentation()
                .description("Documentation")
                .url("https://github.com/GabrielGRS0206/spring-boot-hexagonal-architecture"));
  }



}