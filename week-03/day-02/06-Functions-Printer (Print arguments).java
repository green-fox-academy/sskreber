//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...


import java.util.Scanner;

/* SOLUTION 1 - using user input. Downside: technically, the method only gets passed 1 input in this case
(a String consisting of any number of words), whereas the task description specifies "any number of parameters".
*/

public class Printer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or words, separated by comma and a space: ");
        String inputWords = scanner.nextLine();
        printer(inputWords);
    }

    public static void printer(String... strings) {
        for (String s : strings) {
            System.out.print("\"" + s + "\" ");
        }
    }
}

/* SOLUTION 2 - using any number of String arguments. Downside: it's not user input it takes in,
        but words typed into the main method.
        TBC: how to set a scanner that keeps taking user input
        (word, enter, ... repeat) until user decides to stop inputting?
        In sum: how to programmatically stop scanner from running?
         */

public class Printer {

    public static void main(String[] args) {
        printer("first", "second", "third", "fourth", "etcetera");
    }

    public static void printer(String... strings) {
        for (String s : strings) {
            System.out.print("\"" + s + "\" ");
        }
    }
}