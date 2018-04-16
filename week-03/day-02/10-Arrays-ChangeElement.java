// - Create an array variable named `s`
// with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

public class ChangeElement {
    public static void main(String... args) {

        int[] s = new int[]{1, 2, 3, 8, 5, 6};

        for (int i = 0; i < s.length; i++) {     //finding the element 8 in the array
            if (s[i] == 8) {
                s[i] = 4;       // reassigning its value to 4
                System.out.println(s[i]);   // printing it for self-check
            }
        }

        System.out.println(s[3]);
    }
}