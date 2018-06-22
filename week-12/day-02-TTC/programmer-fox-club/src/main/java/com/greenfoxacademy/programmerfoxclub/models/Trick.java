package com.greenfoxacademy.programmerfoxclub.models;

public enum Trick {
    HTML("writing html"),
    CODE_JAVA("coding java"),
    PLAY_WANDERER("playing wanderer"),
    SURF("surfing"),
    PLAY_CHESS("playing chess"),
    UNDERSTAND_VINTAGE_MOVIES("understanding vintage movies"),
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
