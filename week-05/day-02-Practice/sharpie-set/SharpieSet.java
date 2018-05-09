//Reuse your Sharpie class
//Create SharpieSet class
//it contains a list of Sharpie
//        countUsable() -> sharpie is usable if it has ink in it
//        removeTrash() -> removes all unusable sharpies

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> sharpies;
    int numberOfUsable = 0;

    public SharpieSet() {
        this.sharpies = new ArrayList<Sharpie>();
    }

    public void addSharpie(Sharpie sharpieName) {
        this.sharpies.add(sharpieName);
    }

    public void countUsable() {
        numberOfUsable = 0;
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount > 0) {
                numberOfUsable++;
            }
        }
        System.out.println("Number of usable sharpies: " + numberOfUsable);
    }

    public void removeTrash() {
        int i = 0;
        while (sharpies.size() > 0 && i < sharpies.size() - 1) {
            if (sharpies.get(i).inkAmount <= 0) {
                sharpies.remove(i);
            } else {
                i++;
            }
        }
    }
}

