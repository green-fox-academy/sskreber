import java.util.*;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"

        // sskreber: Additional method (for fun): adds any user input to the end of the array list, then returns & prints the new list:
        putAnyItem(planetList); 

    }

    public static ArrayList putSaturn(ArrayList planetList) {
        planetList.add("Saturn");
        return planetList;
    }

    public static ArrayList putAnyItem(ArrayList planetList) {
        System.out.println(("Please enter desired new list member: "));
        Scanner scanner = new Scanner(System.in);
        String inputItem = scanner.nextLine();
        planetList.add(inputItem);
        System.out.println(planetList);
        return planetList;
    }
}