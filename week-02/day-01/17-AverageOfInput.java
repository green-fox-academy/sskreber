import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int sum = number1 + number2 + number3 + number4 + number5;
        double average = sum / 5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}