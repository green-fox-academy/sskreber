package animals;

public class Bird extends Animal implements EggAbility {

    @Override
    public String breed() {
        return eggMessage;
    }

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }
}
