/*Create a function named is anagram following your current language's style guide.
It should take two strings and return a boolean value depending on whether its an anagram or not.
 */

/* sskreber: solving it by creating one method only (and sparing a lot of code lines 
- less passing of parameters and return values)
 */
 
import java.util.ArrayList;

public class AnagramVersionTwo {

    public static void main(String[] args) {
        System.out.println(isAnagram("god", "dog"));
        System.out.println(isAnagram("green", "fox"));
    }

    public static boolean isAnagram(String word1, String word2) {
        boolean doConstituteAnagramTogether = false;

        String inputWordOne = word1.toLowerCase();
        String inputWordTwo = word2.toLowerCase();
        ArrayList<Character> containedCharactersWord1 = new ArrayList<>();

        for (int i = 0; i < inputWordOne.length(); i++) {
            containedCharactersWord1.add(inputWordOne.charAt(i));
        }

        if (containedCharactersWord1.size() != inputWordTwo.length()) {
            return doConstituteAnagramTogether;
        }

        int overlappingCharacters = 0;
        for (int i = 0; i < containedCharactersWord1.size(); i++) {
            if (containedCharactersWord1.contains(inputWordOne.charAt(i))) {
                overlappingCharacters++;
            }
            if (overlappingCharacters == containedCharactersWord1.size()) {
                doConstituteAnagramTogether = true;
            }
        }
        return doConstituteAnagramTogether;
    }
}
  