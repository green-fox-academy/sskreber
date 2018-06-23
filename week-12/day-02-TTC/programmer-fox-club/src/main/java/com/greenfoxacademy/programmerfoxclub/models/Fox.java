package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.greenfoxacademy.programmerfoxclub.models.Food.*;
import static com.greenfoxacademy.programmerfoxclub.models.Trick.*;
import static com.greenfoxacademy.programmerfoxclub.models.Drink.*;

public class Fox {
    private static long foxCounter = 0;

    private long id;

    private String name;
    private int numberOfLearnedTricks;
    private int numberOfAvailableTricks;
    private Food chosenFood;
    private Drink chosenDrink;

    public List<Trick> learnedTricks = new ArrayList<>();

    public List<Trick> getAvailableTricks() {
        return availableTricks;
    }

    public List<Food> getAvailableFoods() {
        return availableFoods;
    }

    public List<Drink> getAvailableDrinks() {
        return availableDrinks;
    }

    public List<Trick> availableTricks = new ArrayList<>();
    public List<Food> availableFoods = new ArrayList<>();
    public List<Drink> availableDrinks = new ArrayList<>();

    private List<Fox> foxes;

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLearnedTricks() {
        return numberOfLearnedTricks;
    }

    public int getNumberOfAvailableTricks() {
        return numberOfAvailableTricks;
    }

    public void setNumberOfTricks(int numberOfTricks) {
        this.numberOfLearnedTricks = numberOfTricks;
    }

    public Food getFood() {
        return chosenFood;
    }

    public void setFood(Food food) {
        if (this.chosenFood != null) {
            availableFoods.add(chosenFood);
        }
        this.chosenFood = food;
        availableFoods.remove(food);
    }

    public Drink getDrink() {
        return chosenDrink;
    }

    public void setDrink(Drink drink) {
        if (this.chosenDrink != null) {
            availableDrinks.add(chosenDrink);
        }
        this.chosenDrink = drink;
        availableDrinks.remove(drink);
    }

    public List<Trick> getLearnedTricks() {
        return learnedTricks;
    }

    public void learnNewTrick(Trick learnedTrick) {
        this.learnedTricks.add(learnedTrick);
        availableTricks.remove(learnedTrick);
        numberOfLearnedTricks++;
        numberOfAvailableTricks--;
    }

    public Fox(String name) {
        foxCounter++;
        this.id = foxCounter;
        this.name = name;
        this.numberOfLearnedTricks = 0;
        this.learnedTricks = new ArrayList<>();
        this.chosenDrink = WATER;
        this.chosenFood = PIZZA;
        this.fillAvailableDrinksList();
        this.fillAvailableFoodsList();
        this.fillAvailableTricksList();
    }

    public void fillAvailableFoodsList() {
        for (Food foodItem : Food.values()) {
            availableFoods.add(foodItem);
        }
    }

    public void fillAvailableTricksList() {
        for (Trick trickItem : Trick.values()) {
            availableTricks.add(trickItem);
            numberOfAvailableTricks++;
        }
    }

    public void fillAvailableDrinksList() {
        for (Drink drinkItem : Drink.values()) {
            availableDrinks.add(drinkItem);
        }
    }
}
