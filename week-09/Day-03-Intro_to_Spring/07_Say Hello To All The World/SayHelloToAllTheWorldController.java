package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class SayHelloToAllTheWorldController {
    AtomicLong languageIndex = new AtomicLong(0);
    int langIndex = 0;

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] fontColours = {"Black", "Blue", "BlueViolet", "CadetBlue", "Crimson", "DarkMagenta", "DarkOrange", "DarkRed", "DarkSalmon", "DarkSlateGray", "ForestGreen", "Fuchsia", "LightBlue"};

    @RequestMapping("/web/helloeveryone")
    public String greeting(Model model, Model modelStyle) {
        if ((int) languageIndex.get() >= hellos.length) {
            languageIndex.set(0);
        }
        languageIndex.incrementAndGet();
        langIndex = ((int) languageIndex.get()) - 1;
        model.addAttribute("greetingInALanguage", hellos[langIndex]);

        Random random = new Random();
        int fontColour = random.nextInt(fontColours.length);
        int fontSize = (int) (12 + Math.random() * 30);
        modelStyle.addAttribute("fontSize", fontSize);
        modelStyle.addAttribute("fontColour", fontColours[fontColour]);
        return "greeting";
    }
}

