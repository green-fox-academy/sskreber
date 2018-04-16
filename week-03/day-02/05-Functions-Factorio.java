//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns its input's factorial

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();
        System.out.println("The factorial of the number is: " + factorio(userInput));
    }

    public static long factorio(int userIntPutnumber){
        long factorial = 1;     // the result should be a long var since an int might be too small to hold its digits

        for (int i = 1; i <= userIntPutnumber; i++){
            factorial *= i;
        }

        return factorial;
    }
}