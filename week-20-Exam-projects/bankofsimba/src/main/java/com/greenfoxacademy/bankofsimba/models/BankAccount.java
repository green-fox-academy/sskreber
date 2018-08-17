package com.greenfoxacademy.bankofsimba.models;

import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;

    public BankAccount() {
    }

    public BankAccount(String name, String animalType) {
        this(name, 0, animalType);
    }

    public BankAccount(String name, double balance, String animalType) {
        this(name, balance, animalType, false);
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
        if (bankAccount.animalType.equals("lion")) {
            if (bankAccount.name.equals("Scar")) {
                return "Bad Guy";
            }
        } else if (bankAccount.animalType.equals("hyena")) {
            return "Bad Guy";
        }
        return "Good Guy";
    }
}
