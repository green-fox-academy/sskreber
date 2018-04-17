public class DefineBasicInfo {
    public static void main(String[] args) {
        // Defining several things as a variable each, then printing their values
        // My name as a string
        // My age as an integer
        // My height in meters as a double
        // Whether I'm married or not as a boolean

        String name = "sskreber";
        int age = 29;
        double height = 1.69;
        boolean isMarried = false;

        // Printing "false" as marital status would look odd, so I'm creating a helper (String) variable for this.
        String marriedAnswer = "married";
        if (!isMarried){
            marriedAnswer = "single";
        }

        System.out.println("Hi, my nickname is " + name + "!");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + height + " meters tall.");
        System.out.println("Marital status: " + marriedAnswer);
    }
}