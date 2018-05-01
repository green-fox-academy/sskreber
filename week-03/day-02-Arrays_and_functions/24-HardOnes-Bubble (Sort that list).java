import java.util.ArrayList;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending
        //  Example:
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    public static ArrayList<Integer> bubble(int[] listOfNumbers) {
        int[] sortedListArray = new int[listOfNumbers.length];
        ArrayList<Integer> sortingListTemporary = new ArrayList<>();
        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int number : listOfNumbers) {
            sortingListTemporary.add(number);
        }

        int smallerNumber = 0;

        while (sortingListTemporary.size() > 0) {
            for (int i = 0; i < sortingListTemporary.size(); i++) {
                if (sortingListTemporary.get(0) <= sortingListTemporary.get(i)) {
                    smallerNumber = sortingListTemporary.get(0);
                }
                if ((sortingListTemporary.get(i) <= smallerNumber && sortingListTemporary.contains(smallerNumber))
                        || !(sortingListTemporary.contains(smallerNumber))) {
                    smallerNumber = sortingListTemporary.get(i);  //otherwise smallerNumber stays the same for the next for loop
                }
            }
            sortedList.add(smallerNumber);
            sortingListTemporary.remove(sortingListTemporary.indexOf(smallerNumber));
        }
        return sortedList;
    }

    public static ArrayList<Integer> advancedBubble(int[] listOfNumbers, boolean isDescending) {
        ArrayList<Integer> ascendingArrayList = bubble(listOfNumbers);
        ArrayList<Integer> descendingArrayList = new ArrayList<>();
        if (isDescending) {
            for (int i = ascendingArrayList.size() - 1; i >= 0; i--) {
                descendingArrayList.add(ascendingArrayList.get(i));
            }
            return descendingArrayList;
        } else {
            return ascendingArrayList;
        }
    }
}
 