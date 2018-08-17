package com.greenfoxacademy.bankofsimba;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class BankofsimbaApplication implements CommandLineRunner {

    private BankAccountService bankAccountService;

    @Autowired
    public void setBankAccountService(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BankofsimbaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bankAccountService.add(new BankAccount("Simba", 2000, "lion", true));
        bankAccountService.add(new BankAccount("Zazu", 150, "kakadu"));
        bankAccountService.add(new BankAccount("Scar", 10000, "lion"));
        bankAccountService.add(new BankAccount("Nala", 1500, "lion"));
        bankAccountService.add(new BankAccount("Sarabi", 1800, "lion"));
        bankAccountService.add(new BankAccount("Shenzi", 200, "hyena"));
        bankAccountService.add(new BankAccount("Banzai", 50, "hyena"));
    }
}
