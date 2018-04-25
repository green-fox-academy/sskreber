import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleLineVersionTwo {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"

        try {
            File file = new File("my-file.txt");
            FileWriter filewriter = new FileWriter(file);
            filewriter.append("Zsu");
            filewriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("TERMINATED no matter what... So long and thanks for all the fish");
        }
    }
}
