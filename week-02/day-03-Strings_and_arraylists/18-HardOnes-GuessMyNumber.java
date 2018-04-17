//Exercise
//Write a program where the program chooses a number between 1 and 100.
//The player is then asked to enter a guess. If the player guesses wrong, then the program gives feedback and
//asks to enter another guess until the guess is correct.
//Make the range customizable (ask for it before starting the guessing).
//You can add lives. (optional)
//Example
//I've the number between 1-100. You have 5 lives.
//20
//Too high. You have 4 lives left.
//10
//Too low. You have 3 lives left.
//15
//Congratulations. You won!

import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to get default 1-100 number range. \nYou can specify another number range (e.g. 1-20) by typing it in:");
        String inputRange = scanner.nextLine();
        System.out.println("How many lives would you like to have? (Type a number:)");
        int numberOfLives = scanner.nextInt();
        guessMyNumber(inputRange, numberOfLives);
    }

    public static void guessMyNumber(String inputRange, int numberOfLives) {
        int rangeMin;
        int rangeMax;
        if (inputRange.equals("")) {
            rangeMin = 1;
            rangeMax = 100;
        } else {
            String[] inputStringArray = inputRange.split("-");
            rangeMin = Integer.parseInt(inputStringArray[0]);
            rangeMax = Integer.parseInt(inputStringArray[1]);
        }

        int numberToGuess = (int) (rangeMin + Math.random() * (rangeMax - rangeMin));
        Scanner scanner = new Scanner(System.in);
        String takeAwayMessage = "GAME OVER!\nBy the way, the number I thought of was " + numberToGuess + " :)";

        while (numberOfLives != 0) {
            System.out.println("Make your guess: ");
            int guessedNumber = scanner.nextInt();
            if (guessedNumber == numberToGuess) {
                System.out.println("Congratulations! You've won!");
                numberOfLives = 0;
                takeAwayMessage = "Good job!";
            } else if (guessedNumber > numberToGuess) {
                numberOfLives--;
                if (numberOfLives == 1) {
                    System.out.println("Too high. You have " + numberOfLives + " life left.");
                } else if (numberOfLives != 0) {
                    System.out.println("Too high. You have " + numberOfLives + " lives left.");
                }
            } else if (guessedNumber < numberToGuess) {
                numberOfLives--;
                if (numberOfLives == 1) {
                    System.out.println("Too low. You have " + numberOfLives + " life left.");
                } else if (numberOfLives != 0) {
                    System.out.println("Too low. You have " + numberOfLives + " lives left.");
                }
            }
        }
        System.out.println(takeAwayMessage);
    }
}