package com.greenfoxacademy.arrow.models;

import org.springframework.stereotype.Component;

@Component
public class Speed extends YondusArrowControllerResponse {

    public Double distance;
    public Double time;
    public Double speed;

    public Speed() {
    }

    public Speed(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
        this.speed = calculateSpeed(distance, time);
    }

    public double calculateSpeed(Double distance, Double time) {
        return distance / time;
    }
}
