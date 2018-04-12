import java.util.*;

public class Candyshop {
    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    /* SOLUTION 1: creating another arraylist with the to-be-added items,
    replacing original list's wrong items with this list's content.
     */

    public static ArrayList sweets(ArrayList<Object> arrayListOfSweets) {
        ArrayList<Object> arrayListWithNewItems = new ArrayList<Object>();

        arrayListWithNewItems.add("Croissant");
        int indexOfUpdatedItem1 = arrayListWithNewItems.indexOf("Croissant");
        arrayListWithNewItems.add("Ice cream");
        int indexOfUpdatedItem2 = arrayListWithNewItems.indexOf("Ice cream");

        int itemToCorrectIndex1 = arrayListOfSweets.indexOf(2);
        int itemToCorrectIndex2 = arrayListOfSweets.indexOf(false);

        arrayListOfSweets.set(itemToCorrectIndex1, arrayListWithNewItems.get(indexOfUpdatedItem1));
        arrayListOfSweets.set(itemToCorrectIndex2, arrayListWithNewItems.get(indexOfUpdatedItem2));

        return arrayListOfSweets;
    }

    // SOLUTION 2: replacing wrong list members with manually added Strings by calling the .set method on list.

    public static ArrayList sweets(ArrayList<Object> arrayListOfSweets) {
        int itemToCorrectIndex1 = arrayListOfSweets.indexOf(2);
        int itemToCorrectIndex2 = arrayListOfSweets.indexOf(false);

        arrayListOfSweets.set(itemToCorrectIndex1, "Croissant");
        arrayListOfSweets.set(itemToCorrectIndex2, "Ice Cream");

        return arrayListOfSweets;
    }

    /* SOLUTION 3:
    A method that'd iterate through original list's members and check for each if it's a String; if not, replace it.
    Possible? All lists elements of this list are of the object type, as this is an ArrayList of the Object type. 
    Do individual members keep any indication of their original data type, and can we check for it?
    TBC, in the future...
     */
}