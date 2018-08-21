package com.greenfoxacademy.iamgroot.models;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage extends GuardianControllerResponse {

    public String error;

    public ErrorMessage() {
    }

    public ErrorMessage(String error) {
        this.error = error;
    }
}
