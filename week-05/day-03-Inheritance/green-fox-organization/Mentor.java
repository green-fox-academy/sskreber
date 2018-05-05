public class Mentor extends Person {

    public enum Level {
        JUNIOR, INTERMEDIATE, SENIOR
    }

    Level mentorLevel;

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + pGender.toString().toLowerCase() + " " + mentorLevel.toString().toLowerCase() + " mentor.");
    }

    public Mentor(String name, int age, Gender pGender, Level mentorLevel) {
        super(name, age, pGender);
        this.mentorLevel = mentorLevel;
    }

    public Mentor() {
        super("Jane Doe", 30, Gender.FEMALE);
        this.mentorLevel = Level.INTERMEDIATE;
    }
}

