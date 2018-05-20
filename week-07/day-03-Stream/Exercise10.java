// Create a Fox class with 3 properties(name, type, color)
// Fill a list with at least 5 foxes, it's up to you how you name/create them!
// Write a Stream Expression to find the foxes with green color!
// Write a Stream Expression to find the foxes with green color and pallida type!

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise10 {

    public static class Fox {
        String name;
        String type;
        String colour;

        public Fox(String name, String type, String colour) {
            this.name = name;
            this.type = type;
            this.colour = colour;
        }

        @Override
        public String toString() {
            return name + " (" + type + ", " + colour + ")";
        }
    }

    public static void main(String[] args) {
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Vuk", "forest", "red"));
        foxes.add(new Fox("FoxieBoxes", "urban", "red"));
        foxes.add(new Fox("Dan", "forest", "green"));
        foxes.add(new Fox("Gerald", "pallida", "pale"));
        foxes.add(new Fox("Steward", "pallida", "green"));

        List<Fox> greenFoxes = foxes.stream()
                .filter(f -> f.colour.equals("green"))
                .collect(Collectors.toList());

        List<Fox> greenAndPallidaFoxes = foxes.stream()
                .filter(f -> f.colour.equals("green") && f.type.equals("pallida"))
                .collect(Collectors.toList());

        System.out.println(greenFoxes);
        System.out.println(greenAndPallidaFoxes);
    }
}

