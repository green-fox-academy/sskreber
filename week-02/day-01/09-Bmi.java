public class stringTutorial {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        // Self-help: bmi = kg/m2

        double bmi = massInKg / (Math.pow(heightInM, 2));
        System.out.println(bmi);
    }
}