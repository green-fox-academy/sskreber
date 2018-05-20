//Write a Stream Expression to find the uppercase characters in a string!

import java.util.List;
import java.util.stream.Collectors;

public class Exercise05 {
    public static void main(String[] args) {

        String whateverWord = "jhbjhTZHgbnGhThfzgR";
        List<Character> whateverWordUppercases = whateverWord.chars()
                .filter(n -> n > 64 && n < 91)
                .mapToObj(n -> (char) n)
                .collect(Collectors.toList());

        System.out.println(whateverWordUppercases);
    }
}

