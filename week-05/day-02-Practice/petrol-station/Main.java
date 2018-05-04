public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        System.out.println(porsche.capacity);
        System.out.println(porsche.gasAmount);

        Station molByYourWindow = new Station();
        molByYourWindow.refill(porsche);
        System.out.println(porsche.gasAmount);
        System.out.println(molByYourWindow.gasAmount);
    }
}
      