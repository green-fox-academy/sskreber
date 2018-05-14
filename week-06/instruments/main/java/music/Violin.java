package main.java.music;

public class Violin extends StringedInstrument {

    protected String ownSound = "Screech";

    @Override
    protected String sound() {
        return ownSound;
    }

    public Violin() {
        this.name = "Violin";
        this.ownSound = "Screech";
        this.numberOfStrings = 4;
    }

    public Violin(int chosenNumOfStrings) {
        this.name = "Violin";
        this.ownSound = "Screech";
        this.numberOfStrings = chosenNumOfStrings;
    }
}
