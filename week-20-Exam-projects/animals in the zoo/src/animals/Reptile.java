package animals;

public class Reptile extends Animal implements EggAbility {

    public String type = "reptile";

    @Override
    public String breed() {
        return eggMessage;
    }

    public Reptile() {
        setType(type);
    }

    public Reptile(String name) {
        super(name);
        setType(type);
    }
}
