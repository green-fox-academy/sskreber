//Write a function that computes a member of the fibonacci sequence by a given index
//Create tests that covers all types of input (like in the previous workshop exercise)

import java.util.ArrayList;

public class Fibonacci {
    public static int index;
    public static int fibonacciNumber;

    protected static String errorMessageNegOrNotWhole = "Invalid input. Please enter a positive whole number.";

    public Fibonacci() {
    }

    public static int getFibonacciNumber(int inputIndex) {
        if (inputIndex > 0) {
            index = inputIndex;
            ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
            fibonacciNumbers.add(0);
            fibonacciNumbers.add(1);

            for (int i = 2; i <= index; i++) {
                fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
            }
            fibonacciNumber = fibonacciNumbers.get(index - 1);
            return fibonacciNumber;

        } else {
            System.out.println(errorMessageNegOrNotWhole);
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.getFibonacciNumber(-5));
    }
}

