public class Main {

    public static void main(String[] args) {

        Animal littleTiger = new Animal();
        Animal reallyCuteDog = new Animal();

        reallyCuteDog.drink();
        reallyCuteDog.play();

        System.out.println(reallyCuteDog.hunger);
        System.out.println(littleTiger.hunger);

    }
}
