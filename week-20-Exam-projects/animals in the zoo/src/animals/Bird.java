package animals;

public class Bird extends Animal implements EggAbility {

    public String type = "bird";

    @Override
    public String breed() {
        return eggMessage;
    }

    public Bird() {
        setType(type);
    }

    public Bird(String name) {
        super(name);
        setType(type);
    }
}
