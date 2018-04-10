import java.util.Collections;
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int inputNumber = scanner.nextInt();

        String star = "*";
        String whiteSpace = " ";

        int allSpacesInRow = inputNumber + (inputNumber - 1);

        for (int i = 0; i < inputNumber/2; i++) {
            String whiteSpacesPerLineLeftSide = String.join("", Collections.nCopies(((allSpacesInRow - (1 + i * 2) / 2)), whiteSpace));
            String numberOfStarsPerLine = String.join("", Collections.nCopies((1 + i * 2), star));
            /*
            since whiteSpacesPerLineRightSide would have the same value as whiteSpacesPerLineLeftSide,
            I'll use this variable for the white spaces on the stars' right side as well.
             */
            System.out.println(whiteSpacesPerLineLeftSide + numberOfStarsPerLine + whiteSpacesPerLineLeftSide);
        }

        int i = inputNumber/2;
        while (i >= 0) {
            String whiteSpacesPerLineLeftSide = String.join("", Collections.nCopies(((allSpacesInRow - (1 + i * 2) / 2)), whiteSpace));
            String numberOfStarsPerLine = String.join("", Collections.nCopies((1 + i * 2), star));

            System.out.println(whiteSpacesPerLineLeftSide + numberOfStarsPerLine + whiteSpacesPerLineLeftSide);
            i--;
        }
    }
}