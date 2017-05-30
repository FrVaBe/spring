package de.frvabe.spring.cloudconfig.client.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * The main class of the application.
 */
@SpringBootApplication
public class Main {

    @Bean
    @RefreshScope
    public MessageWriter messageWriter(@Value("${message}") final String message) {
        return new MessageWriter(message);
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
        while (true) {
            // get the bean from the application context
            //
            // trigger the 'refresh' endpoint to refresh the configuration
            // $ curl -X POST http://localhost:8080/refresh
            //
            // in case of configuration changes a new bean instance is expected
            MessageWriter mw = ctx.getBean(MessageWriter.class);
            mw.writeMessage();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
