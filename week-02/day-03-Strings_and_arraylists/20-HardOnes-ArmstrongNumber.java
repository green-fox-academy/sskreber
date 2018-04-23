/* Write a simple program to check if a given number is an armstrong number.
The program should ask for a number. E.g. if we type 371, the program should print out: The 371 is an Armstrong number.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Armstrong-number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String inputNumberString = scanner.nextLine();
        double digitsFactorialsSum = 0;

        int inputNumber = Integer.parseInt(inputNumberString);
        ArrayList<Integer> inputNumberArrayList = new ArrayList<>();
        int[] inputNumberArray = new int[inputNumberString.length()];

        for (int i = 0; i < inputNumberString.length(); i++) {
            inputNumberArrayList.add(Integer.parseInt(Character.toString(inputNumberString.charAt(i))));
            digitsFactorialsSum = digitsFactorialsSum + (Math.pow(inputNumberArrayList.get(i), inputNumberString.length()));
        }
        if (digitsFactorialsSum == inputNumber) {
            System.out.println("This is an armstrong number!");
        } else {
            System.out.println("This is NOT an armstrong number!");
        }
    }
}
