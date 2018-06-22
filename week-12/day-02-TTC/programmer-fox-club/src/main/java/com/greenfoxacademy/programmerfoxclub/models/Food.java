package com.greenfoxacademy.programmerfoxclub.models;

public enum Food {
    SALAD("salad"),
    HAM_SANDWICH("ham sandwich"),
    BURGERS("burgers"),
    PIZZA("pizza with ketcup"),
    CHINESE_FOOD("Chinese food"),
    SAUERKRAUT("sauerkraut"),
    APPLE_PIE("apple pie"),
    ;

    private String description;

    Food(String description) {
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
