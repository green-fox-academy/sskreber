
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

import java.util.Scanner;

public class Cuboid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please specify length: ");
        double length = scanner.nextDouble();
        System.out.println("Please specify width: ");
        double width = scanner.nextDouble();
        System.out.println("Please specify height: ");
        double height = scanner.nextDouble();
        int surfaceArea;
        int volume;
        calculateSurfaceAndVolume(length, width, height);
    }

    public static void calculateSurfaceAndVolume(double length, double width, double height) {
        int surfaceArea = (int) (2 * (length * width + width * height + height * length));
        int volume = (int) (length * width * height);
        System.out.println("Surface area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}

