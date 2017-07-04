package de.frvabe.spring.spring.cloud.consul.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * A simple Eureka Server
 * 
 * @see <a href="https://spring.io/guides/gs/service-registration-and-discovery/">Getting Started -
 *      Service Registration and Discovery</>
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
