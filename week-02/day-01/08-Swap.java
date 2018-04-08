public class Swap {
    public static void main(String[] args) {
        // Swapping the values of the variables
        int a = 123;
        int b = 526;
        int c = a + b;
        a = c - a;
        b = c - b;

        System.out.println(a);
        System.out.println(b);
    }
}