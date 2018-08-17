package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountServiceImplemented implements BankAccountService {

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAllAccount() {
        return bankAccounts;
    }

    @Override
    public void createDummyAccount() {
        bankAccounts.add(new BankAccount("Sample Customer", 0, "sample animal"));
    }

    @Override
    public void increaseBalance(int index) {

        BankAccount currentBankAccount = bankAccounts.get(index);

        if (currentBankAccount.accountBelongsToKing(currentBankAccount).equals("king")) {
            currentBankAccount.setBalance(currentBankAccount.getBalance() + 100);
        } else {
            currentBankAccount.setBalance(currentBankAccount.getBalance() + 10);
        }
    }
}

