import java.util.ArrayList;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        // System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        // System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'

        System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
    }

    public static ArrayList<Integer> subInt(int inputNumber, int[] inputList) {

        String[] inputListString = new String[inputList.length];
        int j = 0;
        for (int i : inputList) { // to save the number list into a String[] var too
            inputListString[j] = String.valueOf(i);
            j++;
        }

        String inputNumberString = String.valueOf(inputNumber);
        int index = 0;
        ArrayList<Integer> indexList = new ArrayList<>();
        for (String i : inputListString) {
            if (i.contains(inputNumberString)) {
                indexList.add(index);
                index++;
            } else {
                index++;
            }
        }

        return indexList;
    }
}