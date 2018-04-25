// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteMultipleLines {
    public static void main(String[] args) {
        multipleLinesWriter("my-file.txt", "apple", 7);
    }

    public static void multipleLinesWriter(String location, String word, int numberOfWords) {
        Path path = Paths.get(location);
        ArrayList<String> addedWords = new ArrayList<>();
        try {
            for (int i = 0; i < numberOfWords; i++) {
                addedWords.add(word);
            }
            Files.write(path, addedWords);
        } catch (IOException e) {
            System.out.println("Write unsuccessful");
        }
    }
}
