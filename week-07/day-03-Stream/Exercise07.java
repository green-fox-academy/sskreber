//Write a Stream Expression to find the frequency of characters in a given string!

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise07 {
    public static void main(String[] args) {

        String whateverWord = "jhbjhTZHgbnGhThfzgR";
        Map<String, Long> frequencyList =
                whateverWord.chars()
                        .mapToObj(c -> (char) c)
                        .map(c -> c.toString().toLowerCase())
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyList);
    }
}

