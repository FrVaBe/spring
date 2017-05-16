package de.frvabe.spring.boot.extconfig.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    /**
     * A greeting text.
     */
    public String greeting;

    /**
     * A name that is used in a greeting.
     */
    public String name;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
