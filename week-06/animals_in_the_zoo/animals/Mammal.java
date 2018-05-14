package animals;

public class Mammal extends Animal {

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    public Mammal() {
    }

    public Mammal(String name) {
        super(name);
    }
}
