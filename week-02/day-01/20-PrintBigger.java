import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);
        int inputNumber1 = scanner.nextInt();
        int inputNumber2 = scanner.nextInt();

        if (inputNumber1 > inputNumber2){
            System.out.println(inputNumber1);
        } else {
            System.out.println(inputNumber2);
        }
    }
}