// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   "lime", "forest green", "olive", "pale green", "spring green"
// - In `colors[1]` store the shades of red:
//   "orange red", "red", "tomato"
// - In `colors[2]` store the shades of pink:
//   "orchid", "violet", "pink", "hot pink"

public class Colors {

    public static void main(String[] args) {
        String[][] multiArrayColours = new String[3][5];
        String[] rowZeroOfColours = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[] rowOneOfColours = {"orange red", "red", "tomato"};
        String[] rowTwoOfColours = {"orchid", "violet", "pink", "hot pink"};
        addRowTo(multiArrayColours, rowZeroOfColours, 0);
        addRowTo(multiArrayColours, rowOneOfColours, 1);
        addRowTo(multiArrayColours, rowTwoOfColours, 2);
        printMultiArray(multiArrayColours);
    }

    public static String[][] addRowTo(String[][] multiArray, String[] rowOfUnits, int whichRowToAddTo) {
        for (int i = 0; i < rowOfUnits.length; i++) {
            multiArray[whichRowToAddTo][i] = rowOfUnits[i];
        }
        return multiArray;
    }

    public static void printMultiArray(String[][] multidimArray) {
        for (String[] row : multidimArray) {
            for (String unit : row) {
                if (unit != null) {
                    System.out.print(unit + " | ");
                }
            }
            System.out.println("\t");
        }
    }
}
   