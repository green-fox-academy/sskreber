package com.greenfoxacademy.restbackend.models;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Input {

    public String what;
    public int[] numbers;
    public Integer until;


    public Input() {
    }

    public Input(String what) {
        this.what = what;
    }

    public Input(int[] numbers) {
        this.numbers = numbers;
    }

    public Input(Integer until) {
        this.until = until;
    }

    public Input(String what, int[] numbers, Integer until) {
        this.what = what;
        this.numbers = numbers;
        this.until = until;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }
}
