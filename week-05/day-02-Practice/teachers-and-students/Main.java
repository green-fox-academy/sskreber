public class Main {

    public static void main(String[] args) {
        Teacher mariNeni = new Teacher();
        Student gakuseiSan = new Student();

        mariNeni.teach(gakuseiSan);
        gakuseiSan.question(mariNeni);
    }
}

  