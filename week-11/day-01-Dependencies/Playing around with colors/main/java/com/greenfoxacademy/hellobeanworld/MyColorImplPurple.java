package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;

public class MyColorImplPurple implements MyColor {

    @Autowired
    Printer printer;

    @Override
    public void printColor() {
        printer.log("It is green in colour...");
    }
}
