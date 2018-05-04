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

    public static void rollFullSixes(DiceSet diceSet) {
        diceSet.roll();
        for (int i = 0; i < diceSet.dices.length; i++) {
            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
            }
            System.out.println("This dice has just rolled " + diceSet.getCurrent(i) + ", yay!");
        }
        System.out.println("Success!");
    }
}
    
