import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:
        // System.out.println(subStr("this is what I'm searching in", "searching"));
        // should print: `17`
        // System.out.println(subStr("this is what I'm searching in", "not"));
        // should print: `-1`

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String q = scanner.nextLine();

        subStr(input, q);
    }

    public static int subStr(String input, String q) {
        if (input.contains(q)) {
            int indexOfFirstChar = input.indexOf(q);
            System.out.println(indexOfFirstChar);
            return indexOfFirstChar;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}