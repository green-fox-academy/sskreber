package com.greenfoxacademy.restbackend.models;

public class Result {

    int received;
    int result;

    public Result() {
    }

    public Result(int received, int result) {
        this.received = received;
        this.result = result;
    }

    public void setResult(int received, int result) {
        this.received = received;
        this.result = result;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}