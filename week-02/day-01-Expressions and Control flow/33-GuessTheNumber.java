import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        int numberToGuess = (int) (Math.random() * 20 + 1); // randomly generates a number between 1 and 20,
	// and stores it as the number to guess.

        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        while (userGuess != numberToGuess) {    // the loop is running until user guesses correctly
            if (userGuess < numberToGuess){
                System.out.println("The stored number is higher");
            }
            else if (userGuess > numberToGuess){
                System.out.println("The stored number is lower");
            }
                userGuess = scanner.nextInt();  // it keeps prompting the user to enter a number until the loop runs
        }
        System.out.println("You found the number: " + numberToGuess);
    }
}