import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Expected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList<String> arrayListOne, ArrayList<String> arrayListTwo) {

        ArrayList<String> matchedSexes = new ArrayList<>();
        int arrayListOneSize = arrayListOne.size();
        int arrayListTwoSize = arrayListTwo.size();
        int smallerListSize;

        // Saves list size into an int. If either list is shorter than the other, it saves that length instead of the other lists's:

        if (arrayListOneSize > arrayListTwoSize) {
            smallerListSize = arrayListTwoSize;
        } else {
            smallerListSize = arrayListOneSize;
        }

        /* Iterates through both lists, pairs up each list element to the other list's corresponding element.
        If either list is longer than the other, its extra number of elements won't be paired & won't be added to the matched list
        (due to the use of smallerListSize as index for the last added item):
         */

        for (int i = 0; i < smallerListSize; i++) {
            matchedSexes.add(arrayListOne.get(i));
            matchedSexes.add(arrayListTwo.get(i));
        }

        /*
        sskreber: A little extra I added. If either list is longer than the other & thus has unpaired members,
        this extra part of the method will print their name(s) with a comment.
        This way we can see who didn't make it to the matched list.
         */

        if (!matchedSexes.containsAll(arrayListOne)) {
            for (int i = 0; i < arrayListOneSize - smallerListSize; i++){
                System.out.println(arrayListOne.get(arrayListOneSize - 1 - i) + " is unpaired!");
            }
        } else if (!matchedSexes.containsAll(arrayListTwo)) {
            for (int i = 0; i < arrayListTwoSize - smallerListSize; i++){
                System.out.println(arrayListTwo.get(arrayListTwoSize - 1 - i) + " is unpaired!");
            }
        }

        return matchedSexes;
    }
}