
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int inputDivisor = scanner.nextInt();

        try {
            int result = 10 / inputDivisor;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}




