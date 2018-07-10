package com.greenfoxacademy.arrow.models;

import com.greenfoxacademy.arrow.controllers.YondusArrowController;
import org.springframework.stereotype.Component;

@Component
public class ErrorMessage extends YondusArrowControllerResponse {

    public String error;

    public ErrorMessage() {
    }

    public ErrorMessage(String error) {
        this.error = error;
    }
}
