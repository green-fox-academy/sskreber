import java.util.Collections;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int inputNumber = scanner.nextInt();

        String star = "*";
        String whiteSpace = " ";

        int allSpacesInRow = inputNumber + (inputNumber - 1);

        for (int i = 0; i < inputNumber; i++) {
            String whiteSpacesPerLineLeftSide = String.join("", Collections.nCopies(((allSpacesInRow - (1 + i * 2) / 2)), whiteSpace));
            String numberOfStarsPerLine = String.join("", Collections.nCopies((1 + i * 2), star));
            /*
            since whiteSpacesPerLineRightSide would have the same value as whiteSpacesPerLineLeftSide,
            I'll use this variable for the white spaces on the stars' right side as well.
             */
            System.out.println(whiteSpacesPerLineLeftSide + numberOfStarsPerLine + whiteSpacesPerLineLeftSide);
        }
    }
}