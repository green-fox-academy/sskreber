package main.java.vehicles;

public class Helicopter extends Vehicle implements Flyable {
    public Helicopter() {
        this.colour = "white";
        this.maker = "whateverObscureBrand";
        this.maxSpeed = 300;
    }

    public Helicopter(String inputColour) {
        this.colour = inputColour;
        this.maker = "whateverObscureBrand";
        this.maxSpeed = 300;
    }

    public Helicopter(String inputColour, int inputSpeed) {
        this.colour = inputColour;
        this.maker = "whateverObscureBrand";
        this.maxSpeed = inputSpeed;
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing...");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter is taking off...");
    }
}
