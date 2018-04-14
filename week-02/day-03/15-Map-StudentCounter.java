import java.util.*;

public class StudentCounter {
    public static void main(String... args) {
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Rezso");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add(row5);

        // Display the following things:
        //  - Who has got more candies than 4 candies
        //  - Sum the age of people who have lass than 5 candies

        String namesWhoHaveLotsOfCandy = "";
        int i = 0;      // i is needed to display the names in the format (but not as the type of) a numbered list
        for (Map mapsEach : map) {
            if (Integer.parseInt(mapsEach.get("candies").toString()) > 4) {
                namesWhoHaveLotsOfCandy += i+1 + ". " + (mapsEach.get("name") + " ");  // saving names into String, numbered
                i++;
            }
        }
        System.out.println("The names of those who have more than 4 candies: " + namesWhoHaveLotsOfCandy);

        double sum = 0.0;
        i = 0;      // resetting i to 0, to use to count number of elements we add together, to calculate mean age (for fun, on top of age sum)
        for (Map mapsEach : map) {
            if (Integer.parseInt(mapsEach.get("candies").toString()) < 5) {
                sum += Double.parseDouble(mapsEach.get("age").toString());
                i++;
            }
        }
        double ageMean = sum / i;
        System.out.println("The sum of the age of people with less than 5 candies is: " + sum);
        System.out.println("The average age of people with less than 5 candies is: " + ageMean);    // sskreber: added to the task for fun
    }
    
    
    /* CODE SUMMARY FOR SELF-STUDY LATER (woo-hoo I didn't even check the Net to code this!): 
    (1) getting names of owners of > 4 candies: enhanced FOR loop to iterate through hashmaps as members of a Map-based arraylist (named map).
    Checking value belonging to key "candies" in each hashmap (toString and then Integer.parseInt them to get value as Int); 
    IF statement to access those which are > 4, and do additional stuff to them: get the given hashmap's value belonging to its "name" key and 
    add that to a name-collecting String, to print.
    (2) Sum of the age of people with less than 5 candies: enhanced FOR loop to iterate through each hashmap as members of the same 
    Map-based arraylist (named map). At each iteration, check the value belonging to given hashmap's "candies" key,
    pass it as Int (toString and Integer.parseInt) to be able to check if it's less than 5.
    If less than 5, do stuff to given hashmap: do an additional check of value, now belonging to its "age" key, 
    and add that value (after passign as Int with toString and Integer.parseInt) to a global double var named sum.
     */
}