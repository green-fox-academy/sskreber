public class Main {

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("blue", 3.0);
        System.out.println(sharpie1.inkAmount);
        sharpie1.use();
        System.out.println(sharpie1.inkAmount);
    }
}
