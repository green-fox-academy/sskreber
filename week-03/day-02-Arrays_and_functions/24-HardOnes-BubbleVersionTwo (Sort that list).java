import java.util.ArrayList;
import java.util.Arrays;

public class BubbleVersionTwo {
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
        int[] listOfNumbersCopy = Arrays.copyOf(listOfNumbers, listOfNumbers.length);
        Arrays.sort(listOfNumbersCopy);
        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int number : listOfNumbersCopy) {
            sortedList.add(number);
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
     