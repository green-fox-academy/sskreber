public class Main {

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();
        rollFullSixes(diceSet);
    }

    public static void rollFullSixes(DiceSet diceset) {
        diceset.roll();
        int i = 0;
        while (diceset.getCurrent(0) != 6 && (diceset.getCurrent(1) != 6)
                && diceset.getCurrent(2) != 6 && diceset.getCurrent(3) != 6 && diceset.getCurrent(4) != 6
                && diceset.getCurrent(5) != 6) {
            if (diceset.getCurrent(i) != 6) {
                diceset.reroll(i);
            } else {
                i++;
            }
        }
        System.out.println("Success!");
    }
}
