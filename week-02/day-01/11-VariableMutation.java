public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        // make it smaller by 7
        b -= 7;
        System.out.println(b);
        
        int c = 44;
        // please double c's value
        c *= 2;
        // or: c+= c;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = (int) Math.pow(e, 3);
        //or: e = e * e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        boolean isf1Bigger = f1 > f2;
        System.out.println("Is f1 > f2? " + isf1Bigger);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        // SOLUTION 1: 'double' as in variable type:
        boolean isDoubleOfg1Bigger = (double) g1 > g2;
        System.out.println("Is double of g1 > than g2: " + isDoubleOfg1Bigger);
        // SOLUTION 2: 'double' meaning 'its value doubled'
        boolean isTwiceg1Bigger = 2 * g1 > g2;
        System.out.println("Is two times g1 > than g2: " + isTwiceg1Bigger);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        boolean canBeDividedBy11 = h % 11 == 0;
        System.out.println("Is 11 the divisor of h? " + canBeDividedBy11);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        // SOLUTION 1:
        boolean isStatementTrue = i1 > Math.pow(i2, 2) && i1 < Math.pow(i2, 3);
        System.out.println("The statement about the relation of i1 and i2 is (solution1): " + isStatementTrue);
        // SOLUTION 2:
        boolean isStatementTrue2 = i1 > i2 * i2 && i1 < i2 * i2 * i2;
        System.out.println("The statement about the relation of i1 and i2 is (solution2): " + isStatementTrue2);

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean canBeDividedBy3or5 = (j % 3 == 0) || (j % 5 == 0);
        System.out.println("3 or 5 is the divisor of j: " + canBeDividedBy3or5);

        String k = "Apple";
        //fill the k variable with its content 4 times

        // SOLUTION 1 (with a for loop):
        for (int i = 0; i < 2; i++) {
            k = k + k;
        }
        System.out.println(k);

        // or: SOLUTION 2 (manual manipulation):
        // k = k + k + k + k;
        // System.out.println(k);
    }
}