/*
Create a function named create palindrome following your current language's style guide.
It should take a string, create a palindrome from it and then return it.
Examples:
input: "greenfox", output: "greenfoxxofneerg"
input: "123", output: "123321"
 */

public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(buildPolindrome("greenfox"));
        System.out.println(buildPolindrome("123"));
        System.out.println(buildPolindrome("Arthurdent"));
    }

    public static String buildPolindrome(String inputWord) {
        char[] wordCharacters = inputWord.toCharArray();
        String polindromeVersion = "";
        int j = wordCharacters.length - 1;
        for (int i = 0; i < wordCharacters.length * 2; i++) {
            if (polindromeVersion.length() >= wordCharacters.length && j >= 0) {
                polindromeVersion += wordCharacters[j];
                j--;
            } else {
                polindromeVersion += wordCharacters[i];
            }
        }
        return polindromeVersion;
    }
}
  