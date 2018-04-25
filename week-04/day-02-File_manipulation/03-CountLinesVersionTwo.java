
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// solved by method itself dealing with the exception
public class CountLinesVersionTwo {
    public static void main(String[] args) {
        String fileName = "nonexistent-file.txt";
        numberOfLines(fileName);
    }

    public static int numberOfLines(String fileName) {
        try {
            Path path = Paths.get(fileName);
            List<String> lines = Files.readAllLines(path);
            int numberOfLines = 0;
            for (String line : lines) {
                numberOfLines++;
            }
            return numberOfLines;
        } catch (IOException e) {
            return 0;
        }
    }
}
