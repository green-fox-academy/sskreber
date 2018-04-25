
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

// solved by method throwing exception back to main & main catching it
public class CountLines {
    public static void main(String[] args) {

        String fileName = "nonexistent-file.txt";
        try {
            numberOfLines(fileName);
        } catch (IOException e) {
            System.out.println("Sorry, no such file");
        }
    }

    public static int numberOfLines(String fileName) throws IOException, FileNotFoundException {
        Path path = Paths.get(fileName);
        List<String> lines = Files.readAllLines(path);
        int numberOfLines = 0;
        for (String line : lines) {
            numberOfLines++;
        }
        return numberOfLines;
    }
}
