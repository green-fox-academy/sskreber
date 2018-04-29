import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        // sskreber: my method creates a new file named "decrypted_<original file name>.txt"

        decryptReversed("reversed-lines.txt");
    }

    public static List<String> decryptReversed(String fileName) {
        List<String> decryptedText = new ArrayList<String>();
        try {
            Path path = Paths.get(fileName);
            List<String> reversedText = Files.readAllLines(path);

            for (String line : reversedText) {
                String newline = "";
                for (int i = line.length() - 1; i >= 0; i--) {
                    newline += Character.toString(line.charAt(i));
                }
                decryptedText.add(newline);
            }
            Path decryptedFile = Paths.get("decrypted_" + fileName);
            Files.write(decryptedFile, decryptedText);

        } catch (IOException e) {
            System.out.println("No such file, sorry!");
        }
        return decryptedText;
    }
}

  