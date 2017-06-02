package de.frvabe.spring.spring.cloudnetflix.eureka.client.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Main {

    @Bean
    ServiceClient serviceClient(@Value("${demoServiceName}") final String serviceName,
            final EurekaClient discoveryClient) {
        return new ServiceClient(serviceName, discoveryClient);
    }

    public static void main(String[] args) throws InterruptedException {

        // This is a client and does not provide any API; thus we disable the web environment
        // explicit to ensure that no container is started just because the libraries are on the
        // classpath.
        ConfigurableApplicationContext ctx =
                new SpringApplicationBuilder(Main.class).web(false).run(args);

        ServiceClient serviceClient = ctx.getBean(ServiceClient.class);

        while (true) {
            try {
                System.out.println(serviceClient.getMessageFromService("FooBar"));
            } catch (Exception ex) {
                System.out.println("Something went wrong: " + ex.getMessage());
            }
            Thread.sleep(5000);
        }
    }
}
