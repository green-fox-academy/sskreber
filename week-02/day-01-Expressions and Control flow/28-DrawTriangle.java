import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner (System.in);
        int inputNumber = scanner.nextInt();
        String star = "*";

        for (int i = 0; i < inputNumber; i++){
            System.out.println(star);
            star = star + "*";
        }
    }
}