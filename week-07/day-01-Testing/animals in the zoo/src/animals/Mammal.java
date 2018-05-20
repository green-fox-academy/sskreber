package animals;

public class Mammal extends Animal {

    public String type = "mammal";

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    public Mammal() {
        setType(type);
    }

    public Mammal(String name) {
        super(name);
        setType(type);
    }
}
