import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Double> numbers = new ArrayList<>(Arrays.asList(10.0, 30.0, 40.0, 20.0));

        double sum = addListNumbers(numbers);
        double average = divideTwoNumbers(sum, numbers.size());

        System.out.println(average);
    }

    public static double addListNumbers(List<Double> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = numbers.get(i);
        }
        return sum;
    }

    public static double divideTwoNumbers(double number1, double number2) {
        return number1 / number2;
    }
}
