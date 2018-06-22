package com.greenfoxacademy.programmerfoxclub.models;

public enum Drink {
    WATER("water"),
    COCA_COLA("Coca Cola"),
    PEPSI("Pepsi"),
    BAILEYS("Baileys"),
    JACK_DANIELS("Jack Daniels"),
    ORANGE_SODA("orange soda"),
    ;

    private String description;

    Drink(String description) {
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
