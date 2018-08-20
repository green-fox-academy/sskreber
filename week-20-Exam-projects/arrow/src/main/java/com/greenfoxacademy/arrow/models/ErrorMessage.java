package com.greenfoxacademy.arrow.models;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage extends ArrowPathControllerResponse {

    public String error;

    public ErrorMessage() {
    }

    public ErrorMessage(String error) {
        this.error = error;
    }
}
