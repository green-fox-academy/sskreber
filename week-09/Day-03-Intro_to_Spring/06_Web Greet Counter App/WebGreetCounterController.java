package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class WebGreetCounterController {
    AtomicLong id = new AtomicLong(0);

    @RequestMapping("/web/greeting")
    public String greeting(Model modelHello, Model modelID, @RequestParam("name") String name) {
        id.incrementAndGet();
        modelHello.addAttribute("name", name);
        modelID.addAttribute("id", id);
        return "greeting";
    }
}




