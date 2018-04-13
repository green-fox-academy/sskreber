import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    /* SOLUTION 1: works, but if we call System.out.println on the method in THIS solution, it will, besides its within-method commanded full quote,
    print the quote as a list, with its members separated by commas each.
    Solution to that: don't call 'System.out.println(quoteSwap(list));' call 'quoteSwap(list);' instead.
     */

    public static ArrayList quoteSwap(ArrayList<String> someList) {
        int indexOfFirstSwappable = someList.indexOf("do");
        int indexOfSecondSwappable = someList.indexOf("cannot");
        String tmp = someList.get(indexOfFirstSwappable);
        someList.set(indexOfFirstSwappable, someList.get(indexOfSecondSwappable));
        someList.set(indexOfSecondSwappable, tmp);
        Iterator quoteListItems = someList.iterator();
        while (quoteListItems.hasNext()){
            System.out.print(quoteListItems.next() + " ");
        }
        return someList;
    }

    /* SOLUTION 2: keeps the original call on the method: 'System.out.println(quoteSwap(list));'
    and still prints target output in right form. By saving list's content into a new String var in the target form,
    and returning that.
     */

    public static String quoteSwap(ArrayList<String> someList) {
        String quote = "";
        int indexOfFirstSwappable = someList.indexOf("do");
        int indexOfSecondSwappable = someList.indexOf("cannot");
        String tmp = someList.get(indexOfFirstSwappable);
        someList.set(indexOfFirstSwappable, someList.get(indexOfSecondSwappable));
        someList.set(indexOfSecondSwappable, tmp);
        Iterator quoteListItems = someList.iterator();

        while (quoteListItems.hasNext()){
            quote = quote + quoteListItems.next() + " ";
        }
        return quote;
    }
}