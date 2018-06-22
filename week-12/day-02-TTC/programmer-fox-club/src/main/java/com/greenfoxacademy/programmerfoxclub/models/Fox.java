package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private int numberOfTricks;
    private String food;
    private String drink;

    private List<Trick> learnedTricks;
    private List<Fox> foxes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTricks() {
        return numberOfTricks;
    }

    public void setNumberOfTricks(int numberOfTricks) {
        this.numberOfTricks = numberOfTricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<Trick> getLearnedTricks() {
        return learnedTricks;
    }

    public void setLearnedTricks(List<Trick> learnedTricks) {
        this.learnedTricks = learnedTricks;
    }

    public enum Trick {
        WRITE_HTML,
        CODE_JAVA,
        PLAY_WANDERER,
        SURF,
        PLAY_CHESS,
        WATCH_VINTAGE_MOVIES;
    }

    public Fox(String name) {
        this.name = name;
        this.numberOfTricks = 0;
        this.learnedTricks = new ArrayList<>();
    }
}
