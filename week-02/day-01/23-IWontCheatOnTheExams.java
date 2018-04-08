public class IWontCheatOnTheExams {
    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!

        int i = 0;
        while (i < 100) {
            System.out.println("I won't cheat on the exam!");
            i++;
        }
	// And to check if this really has been a 100 lines:
        System.out.println("Self-check: \"How many times did you write down that line, computer?\" \nComputer: " + "\"" + i + " times, Sir!\"");
    }
}