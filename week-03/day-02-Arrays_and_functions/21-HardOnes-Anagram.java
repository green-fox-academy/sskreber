/*Create a function named is anagram following your current language's style guide.
It should take two strings and return a boolean value depending on whether its an anagram or not.
 */

// sskreber: solving it by creating a method that calls on two submethods on its own

import java.util.ArrayList;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("god", "dog"));
        System.out.println(isAnagram("green", "fox"));
    }

    public static boolean isAnagram(String word1, String word2) {
        boolean doConstituteAnagramTogether = false;
        
        if (areEqualLength(word1, word2)) {
            if (haveSameCharacters(word1, word2)) {
                doConstituteAnagramTogether = true;
                return doConstituteAnagramTogether;
            }
        }
        return doConstituteAnagramTogether;
    }

    public static boolean areEqualLength(String word1, String word2) {
        boolean areOfEqualLength = false;
        if (word1.length() == word2.length()) {
            areOfEqualLength = true;
        }
        return areOfEqualLength;
    }

    public static boolean haveSameCharacters(String word1, String word2) {
        boolean areAnAnagramTogether = false;
        String equallyLongWord1 = word1.toLowerCase();
        String equallyLongWord2 = word2.toLowerCase();
        ArrayList<Character> containedCharactersWord1 = new ArrayList<>();

        for (int i = 0; i < equallyLongWord1.length(); i++) {
            containedCharactersWord1.add(equallyLongWord1.charAt(i));
        }
        int overlappingCharacters = 0;
        for (int i = 0; i < equallyLongWord1.length(); i++) {
            if (containedCharactersWord1.contains(equallyLongWord2.charAt(i))) {
                overlappingCharacters++;
            }
        }
        if (overlappingCharacters == containedCharactersWord1.size()) {
            areAnAnagramTogether = true;
        }
        return areAnAnagramTogether;
    }
}
 