//Write a Stream Expression to find the frequency of numbers in the following array:

import java.util.*;
import java.util.stream.Collectors;

public class Exercise08 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        ArrayList<Integer> frequencies = numbers.stream()
                .mapToInt(n -> Collections.frequency(numbers, n))
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(frequencies);
    }
}

