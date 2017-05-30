package de.frvabe.spring.cloudconfig.client.demo;

import java.util.Date;

/**
 * A simple Writer that repeats writing of a message to the console.
 */
public class MessageWriter {

    private String message;
    private Date started = new Date();

    public MessageWriter(final String message) {
        this.message = message;
    }

    /**
     * Write a message to the console.
     */
    public void writeMessage() {
        System.out.println("Started: " + started + "; message: " + message);
    }

}
