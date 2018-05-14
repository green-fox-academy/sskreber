//Create a Student class that has the same fields and methods as the Person class, and has the following additional
//
//        fields:
//        previousOrganization: the name of the student’s previous company / school
//        skippedDays: the number of days skipped from the course
//        methods:
//        getGoal(): prints out "Be a junior software developer."
//        introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
//        skipDays(numberOfDays): increases skippedDays by numberOfDays
//        The Student class has the following constructors:
//
//        Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
//        Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0

public class Student extends Person implements Cloneable {

    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, Gender pGender, String previousOrganization) {
        super(name, age, pGender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super("Jane Doe", 30, Gender.FEMALE);
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year-old " + pGender.toString().toLowerCase() + " from "
                + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    public Object clone() {
        Student studentClone = null;
        try {
            studentClone = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Hops, cloning is not supported");
            return -1;
        }

        studentClone.name = name;
        studentClone.age = age;
        studentClone.pGender = pGender;
        studentClone.previousOrganization = previousOrganization;
        studentClone.skippedDays = skippedDays;
        return studentClone;
    }

    public void sumUpDetails() {
        System.out.println("Hi, my name is " + name + ", I am a " + age + " year old " + pGender.toString()
                + ", from " + previousOrganization + ", and I've skipped " + skippedDays + " days so far. My object memory source is: " + this);
    }

    //todo
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}



