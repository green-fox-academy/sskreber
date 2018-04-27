// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("my-file.txt", "my-file2.txt");
    }

    public static void copyFile(String fileName1, String fileName2) {
        boolean isCopySuccessful;
        try {
            Path pathInto = Paths.get(fileName1);
            Path pathCopyFrom = Paths.get(fileName2);
            Files.copy(pathCopyFrom, pathInto);
            isCopySuccessful = true;
            System.out.println(isCopySuccessful);

        } catch (IOException e) {
            isCopySuccessful = false;
            System.out.println(isCopySuccessful);
        } 
    }
}

