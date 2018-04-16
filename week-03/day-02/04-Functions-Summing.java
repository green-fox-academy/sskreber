//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sums all the numbers
//   until the given parameter and returns with an integer

// sskreber: I interpreted "until the given parameter" as exclusive, as in, the parameter is NOT included in the sum.


import java.util.Scanner;

// SOLUTION 1 - with an int input number

public class Summing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int inputNumber = scanner.nextInt();  // this user-given number is going to be our parameter
        System.out.println(sum(inputNumber));
    }

    public static int sum(int userInPutNumber) {
        int sum = 0;
        for (int i = 0; i < userInPutNumber; i++) {     // to INCLUDE the user-given parameter in the sum, use i < userInPutNumber + 1
            sum += i;
        }
        return sum;
    }
}


// SOLUTION 2 - with a double input number. Returns the sum until input's rounded int value.

public class Summing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double inputNumber = scanner.nextDouble();  // this user-given number is going to be our parameter
        System.out.println(sum(inputNumber));
    }

    public static int sum(double userInPutNumber) {
        userInPutNumber = (int) Math.round(userInPutNumber);
        System.out.println("rounded value: " + userInPutNumber);
        int sum = 0;
        for (int i = 0; i < userInPutNumber; i++) {     // to INCLUDE the user-given parameter in the sum, use i < userInPutNumber + 1
            sum += i;
        }
        return sum;
    }
}