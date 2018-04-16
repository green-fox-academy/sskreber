// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

// SOLUTION 1: by creating a separate method to calculate the sum:

public class SumElements {
    public static void main(String... args) {
        int[] r = new int[]{54, 23, 66, 12};
        System.out.println(printSum(r));
    }

    public static int printSum(int[] anyIntArray) {
        int result = 0;
        result = anyIntArray[1] + anyIntArray[2];
        return result;
    }
}

// SOLUTION 2: by calculating within main and printing right away:

public class SumElements {
    public static void main(String... args) {
        int[] r = new int[]{54, 23, 66, 12};
        System.out.println(r[1] + r[2]);
    }
}