// stringTutorial
// SubStr

import java.util.Collections;
import java.util.Scanner;

public class stringTutorial {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        // System.out.println(subStr("this is what I'm searching in", "searching"));
        // should print: `17`
        // System.out.println(subStr("this is what I'm searching in", "not"));
        // should print: `-1`

        subStr();
    }

    public static void subStr() {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String q = scanner.nextLine();
        if (input.contains(q)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}