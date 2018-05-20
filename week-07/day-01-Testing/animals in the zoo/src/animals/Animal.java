package animals;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String introduction;

    protected String type;

    protected enum Gender {
        FEMALE, MALE
    }

    protected Gender animalGender;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getName() {
        return name;
    }

    public abstract String breed();

    public void setAge(int inputAge) {
        this.age = inputAge;
    }

    public Gender getGender() {
        return animalGender;
    }

    public void setGender(Gender inputGender) {
        this.animalGender = inputGender;
    }


    public String introduce() {
        try {
            introduction = "Hi, I am a(n) " + name
                    + ", I am a(n) " + type + ". " + "I am a " + age + " year old " + animalGender.toString().toLowerCase() + "!";
        } catch (NullPointerException nullpointer) {
            introduction = "Sorry, I cannot introduce myself without sufficient data.";
        }
        System.out.println(introduction);
        return introduction;
    }

}

