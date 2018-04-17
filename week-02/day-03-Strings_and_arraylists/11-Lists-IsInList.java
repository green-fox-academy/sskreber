import java.util.*;

public class IsInList {
    public static void main(String... args) {
//         ArrayList<Integer> list = (ArrayList)Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);
        /* sskreber: kept getting errors for the above line of the original code,
        so I commented it out.
         */

        // sskreber: added the following instead of the one above, to initialise arraylist & give it its content.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
    }

    public static boolean checkNums(ArrayList<Integer> anyList) {
        boolean containsAll = true;
        ArrayList<Integer> listToContain = new ArrayList<>();
        listToContain.addAll(Arrays.asList(4, 8, 12, 16));
        if (!anyList.containsAll(listToContain)) {
            containsAll = false;
        }
        System.out.println(containsAll);
        return containsAll;
    }
}