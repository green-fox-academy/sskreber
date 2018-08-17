package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShowAccountController {

    private BankAccountService bankAccountService;

    @Autowired
    public void setBankAccountService(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("accounts")
    public String getAllAccount(Model thymeLeafModel) {
        if (bankAccountService.getAllAccount().size() == 0) {
            bankAccountService.createDummyAccount();
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
