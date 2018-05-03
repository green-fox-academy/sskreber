public class Student {

    String studentsName;

    public Student() {

    }

    public void learn() {
        System.out.println("Student is learning...");
    }

    public void question(Teacher teachersVarName) {
        System.out.println("Student is asking a question...");
        teachersVarName.answer(this);
    }
}
