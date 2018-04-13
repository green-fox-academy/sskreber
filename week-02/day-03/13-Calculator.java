import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression: ");
        String userInput = scanner.nextLine();
        calculate(userInput);
    }

    public static int calculate(String userInput) {
        int result = 0;

        ArrayList<Object> userInputArrayList = new ArrayList<>();
        userInputArrayList.addAll(Arrays.asList(userInput.charAt(0), userInput.charAt(2), userInput.charAt(4)));

        String tmp = (String) userInputArrayList.get(0).toString();
        System.out.println("This is tmp: " + tmp);

        userInputArrayList.set(0, userInputArrayList.get(1)); //
        userInputArrayList.set(1, tmp);

        System.out.println("This is the array list: " + userInputArrayList); // to check

        int inputNumber1 = Integer.parseInt(userInputArrayList.get(0).toString());
        int inputNumber2 = Integer.parseInt(userInputArrayList.get(2).toString());
        System.out.println("These are the inputNumbers: " + inputNumber1 + " , " + inputNumber2);

        if (tmp.equals("+")) {
            result = inputNumber1 + inputNumber2;
        } else if (tmp.equals("-")) {
            result = inputNumber1 - inputNumber2;
        } else if (tmp.equals("/")) {
            result = inputNumber1 / inputNumber2;
        } else if (tmp.equals("*")) {
            result = inputNumber1 * inputNumber2;
        }

        System.out.println("The result is: " + result);
        return result;
    }
}