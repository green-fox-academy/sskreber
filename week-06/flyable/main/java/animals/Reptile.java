package main.java.animals;

public class Reptile extends Animal implements EggAbility {

    @Override
    public String breed() {
        return eggMessage;
    }

    public Reptile() {
    }

    public Reptile(String name) {
        super(name);
    }
}
