//Write a Stream Expression to find which number squared value is more then 20 from the following array:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise04 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
        List<Integer> biggerThan20SquareList = numbers.stream()
                .filter(n -> n * n > 20)
                .collect(Collectors.toList());

        System.out.println(biggerThan20SquareList);
    }
}

