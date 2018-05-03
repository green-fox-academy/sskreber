public class Teacher {
    //    Create Student and Teacher classes
//    Student:
//    learn()
//    question(teacher) -> calls the teachers answer method
//    Teacher:
//    teach(student) -> calls the students learn method
//    answer()
    String teachersName;

    public Teacher() {

    }

    public void teach(Student studentVarName) {
        System.out.println("Teacher is teaching...");
        studentVarName.learn();
    }

    public void answer(Student studentVarName) {
        System.out.println("Teacher is answering...");
    }
}

