import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);
        int chickenNumber = scanner.nextInt();
        int pigNumber = scanner.nextInt();

        int legsNumber = chickenNumber * 2 + pigNumber * 4;
        // I went ahead and assumed that none of the pigs has lost a leg...

        System.out.println(legsNumber);
    }
}