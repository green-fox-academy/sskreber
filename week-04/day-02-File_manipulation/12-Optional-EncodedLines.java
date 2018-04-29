import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        // sskreber: my method creates a new file named "decrypted_<original file name>.txt"

        decryptEncoded("encoded-lines.txt");
    }

    public static List<String> decryptEncoded(String fileName) {
        List<String> decryptedText = new ArrayList<String>();
        ArrayList<String> alphabet = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

        try {
            Path path = Paths.get(fileName);
            List<String> encodedText = Files.readAllLines(path);

            for (String line : encodedText) {
                String newline = "";
                for (int i = 0; i < line.length(); i++) {

                    if (alphabet.contains(Character.toString(line.charAt(i)))) {
                        newline += alphabet.get(alphabet.indexOf(Character.toString(line.charAt(i))) - 1);
                    } else if (!(alphabet.contains(Character.toString(line.charAt(i))))) {
                        Character lowercasedCharacter = Character.toLowerCase(line.charAt(i));

                        if (alphabet.contains(Character.toString(lowercasedCharacter))) {
                            String alphabetMember = alphabet.get(alphabet.indexOf(Character.toString(lowercasedCharacter)) - 1);
                            newline += alphabetMember.toUpperCase();
                        }
                        if (Character.toString(line.charAt(i)).equals("/")) {
                            newline += ".";
                        }
                        if (Character.toString(line.charAt(i)).equals(".")) {
                            newline += "-";
                        }
                        if (Character.toString(line.charAt(i)).equals("\"")) {
                            newline += "!";
                        }
                        if (Character.toString(line.charAt(i)).equals("[")) {
                            newline += "z";
                        }
                        if (Character.toString(line.charAt(i)).equals(" ")) {
                            newline += " ";
                        }
                        if (Character.toString(line.charAt(i)).equals("(")) {
                            newline += "'";
                        }
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
 