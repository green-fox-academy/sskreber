package com.greenfoxacademy.basicsecurity.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperSecureController {

    @GetMapping("/")
    public String getMainPage() {
        return "Main page";
    }

    @Secured("ROLE_USER")
    @GetMapping("/user")
    public String getUserPage() {
        return "Only USERs can access this! Congrats, you're in!";
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/admin")
    public String getAdminPage() {
        return "Only ADMINs can access this! Congrats, you're in!";
    }
}
