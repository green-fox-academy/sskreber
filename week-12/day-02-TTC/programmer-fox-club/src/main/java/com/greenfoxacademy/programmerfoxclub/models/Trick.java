package com.greenfoxacademy.programmerfoxclub.models;

public enum Trick {
    HTML("write html"),
    CODE_JAVA("code java"),
    PLAY_WANDERER("play wanderer"),
    SURF("surf"),
    PLAY_CHESS("play chess"),
    UNDERSTAND_VINTAGE_MOVIES("understand vintage movies"),
    ;

    private String description;

    Trick(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
