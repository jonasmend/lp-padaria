package br.edu.fema.lp.jonas.seguranca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import br.edu.fema.lp.jonas.JonasApplication;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class ReportApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JonasApplication.class, args);
    }
}
