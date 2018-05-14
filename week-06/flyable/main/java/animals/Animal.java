package main.java.animals;

public abstract class Animal {

    protected String name;
    protected int age;

    protected enum Gender {
        FEMALE, MALE
    }

    protected Gender animalGender;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
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

    public void introduce() {
        System.out.println("Hi, my name is " + name
                + ", I am a " + this.getClass() + ". " + "I am a " + age + " year old " + animalGender + "!");
    }
}
