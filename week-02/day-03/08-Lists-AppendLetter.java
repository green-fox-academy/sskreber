import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
        // The output should be: "kutya", "macska", "kacsa", "róka", "halacska"
    }

    // SOLUTION 1: with an iterator. Doesn't work... TBC!

//    public static List appendA (List <String> far){
//        Iterator listItems = far.iterator();
//        int i = 0;
//        while (listItems.hasNext()){
//            far.set(i, far.get(i) + "a");
//            i++;
//        }
//
//        return far;
//    }

    // SOLUTION 2: (works)

    public static List appendA (List <String> far){
        int listSize = far.size();

        for (int i = 0; i < listSize; i++){
            far.set(i, far.get(i) + "a");
        }

        return far;
    }
}