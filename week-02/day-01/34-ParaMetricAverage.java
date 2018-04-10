import java.util.Scanner;

public class ParaMetricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("How many numbers would you like me to calculate the sum and average of?");
        Scanner scanner = new Scanner(System.in);
        int numberOfIntegers = scanner.nextInt();
        int inputInteger;
        int sum = 0;
        int i;

        for (i = 0; i < numberOfIntegers; i++){
            System.out.println("Please enter a whole number: ");
            inputInteger = scanner.nextInt();
            sum += inputInteger;
        }

        System.out.println("The sum of the entered numbers is: " + sum);
        System.out.println("The average of the entered numbers is: " + sum / (i + 1.0));
    }
}