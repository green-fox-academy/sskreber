import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        // sskreber: my method creates a decrypted version of the input file named "decrypted_<filename>.txt"

        decryptDoubled("duplicated-chars.txt");
    }

    public static List<String> decryptDoubled(String fileName) {
        List<String> decryptedText = new ArrayList<String>();
        try {
            Path path = Paths.get(fileName);
            List<String> duplicatedText = Files.readAllLines(path);

            for (String line : duplicatedText) {
                String newline = "";
                for (int i = 0; i < line.length(); i++) {
                    if (i % 2 == 0) {
                        newline += Character.toString(line.charAt(i));
                    }
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
   