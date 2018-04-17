// - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`

// SOLUTION 1: output is: "4" "5" "6" "7"

public class PrintAll {
    public static void main(String... args) {

        int[] af = new int[]{4, 5, 6, 7};
        for (int i = 0; i < af.length; i++) {
            System.out.print("\"" + af[i] + "\" ");
        }
    }
}

// SOLUTION 2: prints the elements under each other

public class PrintAll {
    public static void main(String... args) {

        int[] af = new int[]{4, 5, 6, 7};
        for (int i = 0; i < af.length; i++) {
            System.out.println(af[i]);
        }
    }
}