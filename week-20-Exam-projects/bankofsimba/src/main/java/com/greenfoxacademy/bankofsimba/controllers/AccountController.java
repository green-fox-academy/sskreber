package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AccountController {

    private final BankAccountService bankAccountService;
    public static boolean hasCreatedBaseAccounts = false;

    public AccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }


    @GetMapping("accounts")
    public String getAllAccount(Model thymeLeafModel) {
        if (!hasCreatedBaseAccounts) {
            bankAccountService.createAccount();
            hasCreatedBaseAccounts = true;
        }

        thymeLeafModel.addAttribute("accounts", bankAccountService.getAllAccount());
        return "accounts";
    }

    @PostMapping("increasebalance/{index}")
    public String increaseBalanceOfAccount(@PathVariable(value = "index") int index) {
        bankAccountService.increaseBalance(index);
        return "redirect:/accounts";
    }
}

