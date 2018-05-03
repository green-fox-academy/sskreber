public class Main {

    public static void main(String[] args) {
        String myMoneyMessage = "My money is currently at: ";
        String intelliJMessage = "Fucks given by IntelliJ is currently at: ";
        String anitasBossMessage = "Times Anita's boss has been in ";

        Counter myMoney = new Counter(1);
        System.out.println(myMoneyMessage + myMoney.getCurrentValue());
        myMoney.increaseValue(5);
        System.out.println(myMoneyMessage + myMoney.getCurrentValue());

        Counter fucksGivenByIntelliJIfMyProgRuns = new Counter();
        System.out.println(intelliJMessage + fucksGivenByIntelliJIfMyProgRuns.getCurrentValue());
        fucksGivenByIntelliJIfMyProgRuns.increaseValue();
        System.out.println(intelliJMessage + fucksGivenByIntelliJIfMyProgRuns.getCurrentValue());
        fucksGivenByIntelliJIfMyProgRuns.resetValue();
        System.out.println(intelliJMessage + fucksGivenByIntelliJIfMyProgRuns.getCurrentValue());

        Counter timesAnitasBossWasIn = new Counter(3);
        System.out.println(anitasBossMessage + timesAnitasBossWasIn.getCurrentValue());
        timesAnitasBossWasIn.increaseValue();
        System.out.println(anitasBossMessage + timesAnitasBossWasIn.getCurrentValue());
    }
}

  