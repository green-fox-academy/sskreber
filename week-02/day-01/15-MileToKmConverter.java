import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);
        int receivedKm = scanner.nextInt();
        double resultInMiles = receivedKm * 0.621371;
        System.out.println("Your request converted is: " + resultInMiles + " miles");
    }

// Note: predefined class name (MileToKmConverter) is confusing, since task specifies a km to miles conversion, not a mile to km conversion.
}