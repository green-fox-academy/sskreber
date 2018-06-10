package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {


    private boolean isKing;

    private String name;
    private double balance;
    private String animalType;

    public BankAccount() {
    }

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, double balance, String animalType, boolean isKing) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public boolean isKing() {
        return isKing;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String accountBelongsToKing(BankAccount bankAccount) {
        if (bankAccount.isKing()) {
            return "king";
        } else {
            return "-";
        }
    }

    public String accountBelongsToBadGuy(BankAccount bankAccount) {
        if (bankAccount.animalType == "lion") {
            if (bankAccount.name == "Scar") {
                return "Bad Guy";
            }
        } else if (bankAccount.animalType == "hyena") {
            return "Bad Guy";
        }
        return "Good Guy";
    }
}
