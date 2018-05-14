package domino;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println("dominoes: " + dominoes);
        organiseDominoes(dominoes);

        for (Domino d : dominoes) {
            d.printAllFields();
        }
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static List<Domino> organiseDominoes(List<Domino> dominoes) {
        List<Domino> temporaryDominoes = new ArrayList<>(dominoes);

        List<Domino> orderedDominoes = new ArrayList<>();

        orderedDominoes.add(dominoes.get(0));
        temporaryDominoes.remove(0);

        int i = 0;
        int j = 0;
        while (temporaryDominoes.size() > 0) {
            if (orderedDominoes.get(i).getValues()[1] == temporaryDominoes.get(j).getValues()[0]) {
                orderedDominoes.add(temporaryDominoes.get(j));
                temporaryDominoes.remove(j);
                i++;
                j = 0;
            } else {
                j++;
            }
        }
        System.out.println("Our ordered dominoes: " + orderedDominoes);
        return orderedDominoes;
    }
}

