public class Main {

    public static void main(String[] args) {
        SharpieSet sharpieset1 = new SharpieSet();
        Sharpie sharpie1 = new Sharpie("blue", 3.0, sharpieset1);
        Sharpie sharpie2 = new Sharpie("black", 3.0, sharpieset1);
        sharpie1.use();
        sharpieset1.countUsable();
        for (int i = 0; i < 200; i++) {
            sharpie2.use();
        }
        sharpieset1.countUsable();
        sharpieset1.removeTrash();
    }
}
