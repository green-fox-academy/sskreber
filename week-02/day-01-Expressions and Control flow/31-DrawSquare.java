import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        // zsu_karap: Based on these instructions & image, I take it if the number is for example 6, 
        // the square should consist of 6 lines, with (6 - 1 = 5) units of % on its horizontal sides.

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String unit = "%";
        String unitFull = "%"; // the horizontal sides of the square (e.g. %%%%%%)
        String unitBorders = "%";
        String whiteSpaces = " "; // the white spaces between two units of % signs on opposing sides on a horizontal line

        for (int i = 1; i < inputNumber - 1; i++) {
            unitFull = unitFull + "%";
        }

        for (int i = 1; i < (inputNumber - 3); i++) {
            whiteSpaces = whiteSpaces + " ";
        }

        unitBorders = unit + whiteSpaces + unit;

        for (int i = 0; i < inputNumber; i++) {
            if ((i == 0) || (i == inputNumber - 1)) {
                System.out.println(unitFull);   // prints the first and last line of the square image
            }
            else {
                System.out.println(unitBorders);    // prints any line that's not the first or last line of the square image
            }
        }
    }
}