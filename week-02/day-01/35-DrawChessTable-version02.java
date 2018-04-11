import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        // Create a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        /* zsu_karap: In this solution version I shall endeavour to create a pyramid of ANY length based on user input. Yaaay.
         */

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String unit = "%";
        String whiteSpace = " ";
        String line = "";

        for (int j = 0; j < inputNumber; j++) {
            line = "";
            if (j % 2 == 0) {
                for (int i = 0; i < inputNumber; i++) {
                    if (i % 2 == 0) {
                        line += unit;
                    } else {
                        line += whiteSpace;
                    }
                }
                System.out.println(line);
            }
            if (j % 2 == 1) {
                for (int i = 0; i < inputNumber; i++) {
                    if (i % 2 == 0) {
                        line += whiteSpace;
                    } else {
                        line += unit;
                    }
                }
                System.out.println(line);
            }
        }
    }
}