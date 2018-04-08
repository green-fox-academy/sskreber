import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people

        Scanner scanner = new Scanner(System.in);
        int inputNumber1 = scanner.nextInt();
        int inputNumber2 = scanner.nextInt();

        if ((inputNumber1 == inputNumber2) && (inputNumber1 + inputNumber2 > 20)) {
            System.out.println("The party is excellent!");
        } else if ((inputNumber1 != inputNumber2) && (inputNumber1 + inputNumber2 > 20)) {
            // Mind you, the quite a cool party condition will also check true if 0 girls are coming but there are more than 20 guys!
            // (Because a 0:100 ratio, for example, is NOT 1:1 either...)
            System.out.println("Quite a cool party!");
        } else if (inputNumber1 + inputNumber2 < 20) {
            System.out.println("Average party...");
        } else if (inputNumber1 == 0) {
            System.out.println("Sausage party");
            // The above condition will only check true if 0 girls and EXACTLY 20 guys are present.
            // If there are less than 20, the "average party" condition will kick in, and if there are more than 20, the "quite a cool party" will.
        }
    }
}