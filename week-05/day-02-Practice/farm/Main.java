public class Main {

    public static void main(String[] args) {
        Farm farmWhereWeLive = new Farm(7);
        Animal littleTiger = new Animal();
        Animal reallyCuteDog = new Animal(farmWhereWeLive);

        Animal oneCow = new Animal(farmWhereWeLive);
        Animal aBigBull = new Animal(farmWhereWeLive);
        Animal hugeHorse = new Animal(farmWhereWeLive);

        reallyCuteDog.drink();
        reallyCuteDog.play();
        reallyCuteDog.eat();
        oneCow.eat();
        aBigBull.eat();

        System.out.println("The number of animals living on this farm: " + farmWhereWeLive.animals.size());
        System.out.println("Capacity left on this farm: " + farmWhereWeLive.freeCapacity);

        farmWhereWeLive.breed();
        System.out.println("The number of animals living on this farm: " + farmWhereWeLive.animals.size());

        farmWhereWeLive.slaughter();
        System.out.println("The number of animals living on this farm: " + farmWhereWeLive.animals.size());
    }
}

