import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String word1, String word2) {
        boolean areAnagramsTogether = false;

        String inputWordOne = word1.toLowerCase();
        String inputWordTwo = word2.toLowerCase();
        ArrayList<Character> containedCharactersWord1 = new ArrayList<>();

        for (int i = 0; i < inputWordOne.length(); i++) {
            containedCharactersWord1.add(inputWordOne.charAt(i));
        }

        if (containedCharactersWord1.size() != inputWordTwo.length()) {
            return areAnagramsTogether;
        }

        int overlappingCharacters = 0;
        for (int i = 0; i < containedCharactersWord1.size(); i++) {
            if (containedCharactersWord1.contains(inputWordOne.charAt(i))) {
                overlappingCharacters++;
            }
            if (overlappingCharacters == containedCharactersWord1.size()) {
                areAnagramsTogether = true;
            }
        }
        return areAnagramsTogether;
    }
}

