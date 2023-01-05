package coms;

import java.util.Scanner;

public class Choices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String choice;

        System.out.print("\nChoices: \n'C' for Circle\n'S' for Square\n'R' for Rectangle\n'T' for Triangle");

        System.out.print("\n\nPlease choose in the choices above: ");
        choice = sc.nextLine();

        areaofACircle(sc, choice);
        sideOfSquare(sc, choice);
        lengthAndWidth(sc, choice);
        baseAndHeight(sc, choice);
    }

    static void areaofACircle(Scanner sc, String choice) {

        if (choice.equals("C") || choice.equals("c")) {
            System.out.print("\nEnter radius of a circle: ");
            double rad = sc.nextDouble();

            double area = 3.1416 * rad * rad;

            System.out.format("\nArea of a circle is: %.2f", area);
        }

    }

    static void sideOfSquare(Scanner sc, String choice) {

        if (choice.equals("S") || choice.equals("s")) {
            System.out.print("\nEnter sides of a square: ");
            double sides = sc.nextDouble();

            double area = sides * sides;

            System.out.format("\nArea of a square is: %.2f", area);
        }

    }

    static void lengthAndWidth(Scanner sc, String choice) {

        if (choice.equals("R") || choice.equals("r")) {
            System.out.print("\nEnter length of a rectangle: ");
            double l = sc.nextDouble();
            System.out.print("\nEnter width of a rectangle: ");
            double w = sc.nextDouble();

            double area = l * w;

            System.out.format("\nArea of a rectangle is: %.2f", area);
        }
    }

    static void baseAndHeight(Scanner sc, String choice) {

        if (choice.equals("T") || choice.equals("t")) {
            System.out.print("\nEnter base of a triangle: ");
            double b = sc.nextDouble();
            System.out.print("\nEnter height of a triangle: ");
            double h = sc.nextDouble();

            double area = b * h / 2;

            System.out.format("\nArea of a triangle is: %.2f", area);
        }

    }

}
