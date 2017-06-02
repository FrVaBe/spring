package de.frvabe.spring.spring.cloudnetflix.eureka.server.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Main {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(Main.class).web(true).run(args);
        SpringApplication.run(Main.class, args);
    }
}
