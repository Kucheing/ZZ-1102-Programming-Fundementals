//for every 115 square feet of wall space, one gallon of paint is needed, 8 hours of labor required
// charges $18.00 per hour of labor

import java.util.Scanner;

public class paintingCost {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number of rooms
        System.out.print("Enter the number of rooms to be painted: ");
        int rooms = input.nextInt();

        //get price per gallon
        System.out.print("Enter the price per gallon of paint: ");
        double pricePerGallon = input.nextDouble();

        // Get total square feet using for loop
        double totalSquareFeet = 0;
        for (int i = 1; i <= rooms; i++) {
            System.out.print("Enter the square feet of wall space in room " + i + ": ");
            double squareFeet = input.nextDouble();
            totalSquareFeet += squareFeet;
        }

        //setting all required methods
        double gallons = getGallonsRequired(totalSquareFeet);// The number of gallons of paint required
        double laborHours = getLaborHours(gallons);// The hours of labor required
        double paintCost = getPaintCost(gallons, pricePerGallon);// The cost of the paint
        double laborCharges = getLaborCharges(laborHours);//The labor charges
        double totalCost = getTotalCost(paintCost, laborCharges);// The total cost of the paint job

        displayData(gallons, laborHours, paintCost, laborCharges, totalCost);
    }

    public static double getGallonsRequired(double totalSquareFeet) {
        return Math.ceil(totalSquareFeet / 115.0);
    }

    public static double getLaborHours(double gallons) {
        return gallons * 8;
    }

    public static double getPaintCost(double gallons, double pricePerGallon) {
        return gallons * pricePerGallon;
    }

    public static double getLaborCharges(double laborHours) {
        return laborHours * 18.0;
    }

    public static double getTotalCost(double paintCost, double laborCharges) {
        return paintCost + laborCharges;
    }

    public static void displayData(double gallons, double laborHours, double paintCost, double laborCharges, double totalCost) {
        System.out.printf("Gallons of paint required: %.0f\n", gallons);
        System.out.printf("Hours of labor required: %.2f\n", laborHours);
        System.out.printf("Cost of the paint: $%.2f\n", paintCost);
        System.out.printf("Labor charges: $%.2f\n", laborCharges);
        System.out.printf("Total cost of the paint job: $%.2f\n", totalCost);
    }
}

/*import java.util.Scanner;

public class PaintingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rooms to be painted: ");
        int rooms = input.nextInt();

        System.out.print("Enter the price per gallon of paint: ");
        double pricePerGallon = input.nextDouble();

        double totalSquareFeet = 0;
        for (int i = 1; i <= rooms; i++) {
            System.out.print("Enter the square feet of wall space in room " + i + ": ");
            totalSquareFeet += input.nextDouble();
        }

        double gallons = getGallonsRequired(totalSquareFeet);
        double laborHours = getLaborHours(gallons);
        double paintCost = getPaintCost(gallons, pricePerGallon);
        double laborCharges = getLaborCharges(laborHours);
        double totalCost = getTotalCost(paintCost, laborCharges);

        displayData(gallons, laborHours, paintCost, laborCharges, totalCost);
    }

    public static double getGallonsRequired(double totalSquareFeet) {
        return Math.ceil(totalSquareFeet / 115.0);
    }

    public static double getLaborHours(double gallons) {
        return gallons * 8;
    }

    public static double getPaintCost(double gallons, double pricePerGallon) {
        return gallons * pricePerGallon;
    }

    public static double getLaborCharges(double laborHours) {
        return laborHours * 18.0;
    }

    public static double getTotalCost(double paintCost, double laborCharges) {
        return paintCost + laborCharges;
    }

    public static void displayData(double gallons, double laborHours, double paintCost, double laborCharges, double totalCost) {
        System.out.printf("Gallons of paint required: %.0f\n", gallons);
        System.out.printf("Hours of labor required: %.2f\n", laborHours);
        System.out.printf("Cost of the paint: $%.2f\n", paintCost);
        System.out.printf("Labor charges: $%.2f\n", laborCharges);
        System.out.printf("Total cost of the paint job: $%.2f\n", totalCost);
    }
} */
