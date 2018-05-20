//Write a Stream Expression to convert a char array to a string!

import java.util.stream.Collectors;

public class Exercise09 {
    public static void main(String[] args) {
        char[] charArray = {'g', 'o', 'o', 'd', 'i', 'e'};

        String charArrayStringVersion = new String(charArray).chars()
                .mapToObj(n -> (char) n)
                .map(n -> n.toString())
                .collect(Collectors.joining());

        System.out.println(charArrayStringVersion);
    }
}

