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
    public void createAccount() {
        bankAccounts.add(new BankAccount("Simba", 2000, "lion", true));
        bankAccounts.add(new BankAccount("Zazu", 150, "kakadu"));
        bankAccounts.add(new BankAccount("Scar", 10000, "lion"));
        bankAccounts.add(new BankAccount("Nala", 1500, "lion"));
        bankAccounts.add(new BankAccount("Sarabi", 1800, "lion"));
        bankAccounts.add(new BankAccount("Shenzi", 200, "hyena"));
        bankAccounts.add(new BankAccount("Banzai", 50, "hyena"));
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

