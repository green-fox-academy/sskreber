// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {
    public static void main(String[] args) {
        int unit1 = 1;
        int unit2 = 0;
        int[][] patternedList = new int[4][4];

        for (int i = 0; i < patternedList.length; i++) {
            for (int j = 0; j < patternedList.length; j++) {
                if (i == j) {
                    patternedList[i][j] = unit1;
                } else {
                    patternedList[i][j] = unit2;
                }
                System.out.print(patternedList[i][j]);
            }
            System.out.println("\t");
        }
    }
}
  