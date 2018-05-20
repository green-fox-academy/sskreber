// Write a function that takes a string as an argument and returns a dictionary with all letters in the string as keys,
// and numbers as values that shows how many occurrences there are.
// Create a test for that.

import java.util.HashMap;

public class CountLetters {

    public CountLetters() {
    }

    public static HashMap<Character, Integer> getLetterFreqDictionary(String anyString) {
        String anyStringLowercase = anyString.toLowerCase();
        HashMap<Character, Integer> letterFreqDictionary = new HashMap<>();
        int counter = 1;

        int i = 0;
        int j = 0;
        while (i < anyStringLowercase.length()) {
            if (!letterFreqDictionary.containsKey(anyStringLowercase.charAt(i))) {
                j = i + 1;
                while (j < anyStringLowercase.length()) {
                    if (anyStringLowercase.charAt(i) == anyStringLowercase.charAt(j)) {
                        counter++;
                    }
                    j++;
                }
                letterFreqDictionary.put(anyStringLowercase.charAt(i), counter);
                counter = 1;
            }
            i++;
        }

        return letterFreqDictionary;
    }
}

