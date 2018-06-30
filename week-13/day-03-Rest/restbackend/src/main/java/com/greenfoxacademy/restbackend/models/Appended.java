package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

@Component
public class Appended {

    private String appended;

    public Appended() {
    }

    public Appended(String appended) {
        this.appended = appended;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
