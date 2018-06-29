package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class Message {

    public String welcomeMessage;

    public Message() {
    }

    public Message(String welcome_message) {
        this.welcomeMessage = welcome_message;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
