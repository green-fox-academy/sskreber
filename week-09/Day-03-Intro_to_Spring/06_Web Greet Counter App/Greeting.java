package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    AtomicLong  id;
    String content;

    public AtomicLong getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(AtomicLong id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Greeting(AtomicLong id, String content) {
        this.id = id;
        this.content = content;
    }
}
