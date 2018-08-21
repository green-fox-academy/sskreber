package com.greenfoxacademy.iamgroot.models;

import org.springframework.stereotype.Component;

@Component
public class Groot extends GuardianControllerResponse{

    public String received;
    public String translated;

    public Groot() {
    }

    public Groot(String receieved, String translated) {
        this.received = receieved;
        this.translated = translated;
    }

    public String getGrootMessage(String received) {
        return translated;
    }
}
