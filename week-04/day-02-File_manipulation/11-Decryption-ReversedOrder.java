import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        // sskreber: my method creates a new file named "decrypted_<original file name>.txt"

        decryptReversedOrder("reversed-order.txt");
    }

    public static List<String> decryptReversedOrder(String fileName) {
        List<String> decryptedText = new ArrayList<>();
        try {
            Path path = Paths.get(fileName);
            List<String> reversedOrderText = Files.readAllLines(path);
            String[] decryptedTextTemporary = new String[reversedOrderText.size()];

            int i = reversedOrderText.size() - 1;
            for (String line : reversedOrderText) {
                decryptedTextTemporary[i] = line;
                i--;
            }

            Path decryptedFile = Paths.get("decrypted_" + fileName);
            for (String line : decryptedTextTemporary) {
                decryptedText.add(line);
            }
            Files.write(decryptedFile, decryptedText);
        } catch (IOException e) {
            System.out.println("No such file, sorry!");
        }
        return decryptedText;
    }
}

  