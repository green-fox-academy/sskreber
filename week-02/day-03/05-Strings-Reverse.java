public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        reverse(reversed);
        reverse("!yrteop nogoV si sihT"); // to test if the method runs on any String
    }

    /* SOLUTION 1: using StringBuilder and charAt(), looking up input's characters in reverse one by one, adding them
    to a StringBuilder object, casting that result as a String and rewriting input's content with it.
    */
    public static String reverse(String stringToReverse) {

        int reversedLength = stringToReverse.length();

        StringBuilder sb = new StringBuilder();
        for (int i = reversedLength - 1; i >= 0; i--) {
            /* The loop iterates through the text starting from the last character, adding each character
            to a new character sequence starting from the latter's index 0.
             */
            char c = stringToReverse.charAt(i);
            sb.append(c);
        }
        stringToReverse = sb.toString();   // The original String's value gets set to the new character sequence's value.
        System.out.println(stringToReverse);
        return stringToReverse;
    }

    /* SOLUTION 2: saving input's content into a char array, iterating through it in reverse, saving result characters
    one by one to new char array starting from index 0, getting its final content into String, rewriting original input with it.
     */

    public static String reverse(String stringToReverse) {
        int reversedLength = stringToReverse.length();
        char[] reversed = stringToReverse.toCharArray();

        char properText[] = new char[reversedLength];
        int j = 0;
        for (int i = reversedLength - 1; i >= 0; i--) {
            properText[i] = reversed[j];
            j++;
        }
        stringToReverse = String.valueOf(properText);
        System.out.println(stringToReverse);
        return stringToReverse;
    }
}