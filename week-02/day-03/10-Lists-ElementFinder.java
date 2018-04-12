import java.util.*;

public class ElementFinder{
    public static void main(String... args) {

        // ArrayList<Integer> arrayList = (ArrayList<>)Arrays.asList(1,2,3,4,5);
        /* sskreber: kept getting errors for the above line of the original code,
        so I commented it out.
         */

        // sskreber: added the following two extra lines instead of the one above, to initialise arraylist & give it content.
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }

    // SOLUTION 1:

    public static String containsSeven(ArrayList<Integer> arrayList) {
        String methodMessage = "Noooooo";
        if (arrayList.contains(7)) {
            methodMessage = "Hooray";
        }
        return methodMessage;
    }

    // SOLUTION 2:
    
    public static String containsSeven(ArrayList<Integer> arrayList) {
        String methodMessage = "Noooooo";
        for (Integer i : arrayList){
            if (arrayList.get(i-1) == 7){
                methodMessage = "Hoorray";
            }
        }
        return methodMessage;
    }
}