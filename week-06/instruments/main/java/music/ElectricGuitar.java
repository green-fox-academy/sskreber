package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    @Override
    protected String sound() {
        return ownSound;
    }

    public ElectricGuitar() {
        this.name = "Electric Guitar";
        this.ownSound = "Twang";
        this.numberOfStrings = 6;
    }

    public ElectricGuitar(int chosenNumOfStrings) {
        this.name = "Electric Guitar";
        this.ownSound = "Twang";
        this.numberOfStrings = chosenNumOfStrings;
    }
}
