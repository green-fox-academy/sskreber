package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CreateAccountController {

    private BankAccountService bankAccountService;

    @Autowired
    public void setBankAccountService(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @RequestMapping("createaccount")
    public String newAccount() {
        return "createaccount";
    }

    @PostMapping("submitnewaccount")
    public String submitNewAccount(@ModelAttribute(value = "name") String name,
                                @RequestParam(value = "balance", required = false, defaultValue = "0.0") Double balance,
                                @RequestParam(value = "animalType", required = false, defaultValue = "unknown") String animalType,
                                @RequestParam(value = "isKing", required = false, defaultValue = "false") boolean isKing) {
        bankAccountService.add(new BankAccount(name, balance, animalType, isKing));
        return "redirect:/accounts";
    }
}

