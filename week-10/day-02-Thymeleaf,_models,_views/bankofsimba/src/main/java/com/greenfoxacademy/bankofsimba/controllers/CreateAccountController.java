package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateAccountController {

    private final BankAccountService bankAccountService;

    public CreateAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @RequestMapping("createaccount")
    public String newAccount() {
        return "createaccount";
    }

    @PostMapping("submitnewaccount")
    public String submitNewAccount(@ModelAttribute(value = "name") String name,
                                @ModelAttribute(value = "balance") Double balance,
                                @ModelAttribute(value = "animalType") String animalType,
                                @ModelAttribute(value = "isKing") Boolean isKing) {
        bankAccountService.add(new BankAccount(name, balance, animalType, isKing));
        return "redirect:/accounts";
    }
}
