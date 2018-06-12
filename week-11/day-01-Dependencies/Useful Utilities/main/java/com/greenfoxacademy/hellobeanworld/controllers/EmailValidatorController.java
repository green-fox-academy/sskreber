package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.ValidateEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController {

    private final ValidateEmailService validateEmailService;
    protected static final String VALID_EMAIL_MESSAGE = " is a valid email address.";
    protected static final String INVALID_EMAIL_MESSAGE = " is not a valid email address.";
    protected static final String EMAIL_PROMPT = " Please enter an email address into the URL to use this function.";
    protected static final String COLOUR_RED = "red";
    protected static final String COLOUR_GREEN = "green";
    protected static final String COLOUR_BLACK = "black";

    @Autowired
    public EmailValidatorController(ValidateEmailService validateEmailService) {
        this.validateEmailService = validateEmailService;
    }

    @GetMapping("useful/email")
    public String validateEmail(Model validEmailModel, Model invalidEmailModel, @RequestParam(value = "email", required = false, defaultValue = EMAIL_PROMPT) String inputEmail) {

        if(inputEmail.equals(EMAIL_PROMPT)) {
            inputEmail = "";
            validEmailModel.addAttribute("message", EMAIL_PROMPT);
            validEmailModel.addAttribute("fontColour", COLOUR_BLACK);
        }
        else if (validateEmailService.validateEmail(inputEmail)) {
            validEmailModel.addAttribute("message", VALID_EMAIL_MESSAGE);
            validEmailModel.addAttribute("fontColour", COLOUR_GREEN);
        } else {
            invalidEmailModel.addAttribute("message", INVALID_EMAIL_MESSAGE);
            validEmailModel.addAttribute("fontColour", COLOUR_RED);
        }
        validEmailModel.addAttribute("email", inputEmail);
        return "email";
    }

    @GetMapping("useful/email?email=is@this.valid")
    public String validateEmailExample() {
        return "email";
    }
}
