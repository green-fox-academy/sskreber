//Write a Stream Expression to find the frequency of numbers in the following array:

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise08VersionTwo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Integer, Long> numbersMatchedWithFrequencies = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(numbersMatchedWithFrequencies);
    }
}

