public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.

        for (int i = 1; i <= 100; i++){
            if (i % 15 == 0) {
                System.out.println("FizzBuzz"); // when a number has both 3 and 5 as its divider.
            }
            else if (i % 3 == 0){
                System.out.println("Fizz"); // when the number can be divided by 3 without a remainder but not by 5
            }
            else if (i % 5 == 0){
                System.out.println("Buzz"); // when the number can be divided by 5 without a remainder but not by 3
            }
            else {
                System.out.println(i); // when the number can be divided by both 3 and 5 without a remainder
            }
        }
    }
}