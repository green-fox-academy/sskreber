package main.java.animals;

import main.java.vehicles.Flyable;

public class Bird extends Animal implements EggAbility, Flyable {

    @Override
    public String breed() {
        return eggMessage;
    }

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void land() {
        System.out.println("Bird is landing...");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird is taking off...");
    }
}
