import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    public static String ticTacResult(String gameFile) {
        String returnedResult = "";
        try {
            Path path = Paths.get(gameFile);
            List<String> gameLines = Files.readAllLines(path);
            int xPointsHor = 0;
            int xPointsVert = 0;
            int oPointsHor = 0;
            int oPointsVert = 0;
            int xPointsDiag = 0;
            int oPointsDiag = 0;
            int i = 0;
            while (xPointsHor < 3 && xPointsVert < 3 && oPointsHor < 3 && oPointsVert < 3 && xPointsDiag < 3 && oPointsDiag < 3 && i < gameLines.size()) {
                xPointsHor = 0;
                oPointsHor = 0;
                xPointsVert = 0;
                oPointsVert = 0;
                for (int j = 0; j < gameLines.size(); j++) {
                    if (gameLines.get(i).charAt(j) == 'X') {
                        xPointsHor++;
                    }
                    if (gameLines.get(i).charAt(j) == 'O') {
                        oPointsHor++;
                    }
                    if (gameLines.get(j).charAt(i) == 'X') {
                        xPointsVert++;
                    }
                    if (gameLines.get(j).charAt(i) == 'O') {
                        oPointsVert++;
                    }
                }
                if (gameLines.get(i).charAt(i) == 'X') {
                    xPointsDiag++;
                    if (xPointsDiag == 3) {
                        returnedResult = "X";
                        return returnedResult;
                    }
                }
                if (gameLines.get(i).charAt(i) == 'O') {
                    oPointsDiag++;
                    if (oPointsDiag == 3) {
                        returnedResult = "O";
                        return returnedResult;
                    }
                }
                i++;
            }
            xPointsDiag = 0;
            oPointsDiag = 0;
            for (int j = 0; j < gameLines.size(); j++) {
                if (gameLines.get(gameLines.size() - 1 - j).charAt(j) == 'X') {
                    xPointsDiag++;
                } else if (gameLines.get(gameLines.size() - 1 - j).charAt(j) == 'O') {
                    oPointsDiag++;
                }
            }
            if (xPointsHor == 3 || xPointsVert == 3 || xPointsDiag == 3) {
                returnedResult = "X";
            } else if (oPointsHor == 3 || oPointsVert == 3 || oPointsDiag == 3) {
                returnedResult = "O";
            } else {
                returnedResult = "draw";
            }
        } catch (IOException e) {
            System.out.println("Ooops! File not found or some similar tragedy!");
        }
        return returnedResult;
    }
}
 