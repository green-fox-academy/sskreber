public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        // Solving it using variables:
        System.out.println("SOLUTION 1: with variables");
        int weeks = 17;
        int codedDaysPerWeek = 5;
        int codedHoursPerDay = 6;
        double weeklyWorkHours = 52.;
        int allSemesterCodingHours = weeks * codedDaysPerWeek * codedHoursPerDay;
        System.out.println("An attendee's sum of hours spent by coding per semester: " + allSemesterCodingHours + " hours");
        double semesterWorkHours = weeks * weeklyWorkHours;
        int percentageCodingHours = (int) (allSemesterCodingHours / semesterWorkHours * 100);

        System.out.println("Percentage of coding hours per semester: " + percentageCodingHours + "%");

        // Solving it using mathematical operations, without declaring variables:
        System.out.println("SOLUTION 2: without declaring variables");
        System.out.println("An attendee's sum of hours spent by coding per semester: " + 17 * 5 * 6 + " hours");
        System.out.println("Percentage of coding hours per semester: " + (int) ((17 * 5 * 6) / (17 * 52.) * 100) + "%");
    }
}