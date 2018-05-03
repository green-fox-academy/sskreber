// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   "lime", "forest green", "olive", "pale green", "spring green"
// - In `colors[1]` store the shades of red:
//   "orange red", "red", "tomato"
// - In `colors[2]` store the shades of pink:
//   "orchid", "violet", "pink", "hot pink"

public class ColorsVersionTwo {

    public static void main(String[] args) {
        String[][] multiArrayColours = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };
        printMultiArray(multiArrayColours);
    }

    public static void printMultiArray(String[][] multidimArray) {
        for (String[] row : multidimArray) {
            for (String unit : row) {
                System.out.print(unit + " | ");
            }
            System.out.println("\t");
        }
    }
}


