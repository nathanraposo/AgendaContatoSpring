package br.com.agendacontato.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 Anotação @SpringBootApplication é utilizada para iniciar a aplicação é igual a
 @Configuration
 @EnableAutoConfiguration
 @ComponentScan */
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
