package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.greenfoxacademy.programmerfoxclub.models.Food.*;
import static com.greenfoxacademy.programmerfoxclub.models.Trick.*;
import static com.greenfoxacademy.programmerfoxclub.models.Drink.*;

public class Fox {
    private String name;
    private int numberOfTricks;
    private Food chosenFood;
    private Drink chosenDrink;

    public List<Trick> learnedTricks = new ArrayList<>();
    public List<Trick> availableTricks = new ArrayList<>();
    public List<Food> availableFoods = new ArrayList<>();
    public List<Drink> availableDrinks = new ArrayList<>();

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
        numberOfTricks++;
    }

    public Fox(String name) {
        this.name = name;
        this.numberOfTricks = 0;
        this.learnedTricks = new ArrayList<>();
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
        }
    }

    public void fillAvailableDrinksList() {
        for (Drink drinkItem : Drink.values()) {
            availableDrinks.add(drinkItem);
        }
    }
}
