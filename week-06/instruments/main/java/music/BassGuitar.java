package main.java.music;

public class BassGuitar extends StringedInstrument {

    @Override
    protected String sound() {
        return ownSound;
    }

    public BassGuitar() {
        this.name = "Bass Guitar";
        this.ownSound = "Duum-duum-duum";
        this.numberOfStrings = 4;
    }

    public BassGuitar(int chosenNumOfStrings) {
        this.name = "Bass Guitar";
        this.ownSound = "Duum-duum-duum";
        this.numberOfStrings = chosenNumOfStrings;
    }
}
