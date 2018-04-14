import java.util.ArrayList;
import java.util.Scanner;

/* sskreber: In this solution version, both the number and the int[] parameters
of the SubInt function are created by prompting the user to type them in.

public class SubInt{
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        // System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        // System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
        //  should print: '[]'

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("Please type in how many numbers you'd like your list to contain: ");
        int listLength = scanner.nextInt();
        System.out.println("Please enter the whole numbers you'd like to have on your list, one by one: ");
        int[] inputList = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            inputList[i] = scanner.nextInt();
        }

        System.out.println(subInt(inputNumber, inputList));
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
