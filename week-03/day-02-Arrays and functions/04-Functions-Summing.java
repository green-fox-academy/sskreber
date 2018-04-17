//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sums all the numbers
//   until the given parameter and returns with an integer

// sskreber: I interpreted "until the given parameter" as exclusive, as in, the parameter is NOT included in the sum.


import java.util.Scanner;

// SOLUTION 1 - with an int input number

public class Summing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int inputNumber = scanner.nextInt();  // this user-given number is going to be our parameter
