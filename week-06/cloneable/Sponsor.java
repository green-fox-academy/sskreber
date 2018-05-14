public class Sponsor extends Person {

    String company;
    int hiredStudents;

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + pGender.toString().toLowerCase() +
                " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        this.hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, Gender pGender, String company) {
        super(name, age, pGender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super("Jane Doe", 30, Gender.FEMALE);
        this.company = "Google";
        this.hiredStudents = 0;
    }
}
