
import java.util.Scanner;

public class Converters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance in meters: ");
        int meters = input.nextInt();
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. Convert to Feet");
        System.out.println("4. Quit the Program");

        System.out.println("Enter your choice");
        int menuNum = input.nextInt();
        // System.out.println(meters + " meters is " + );

        double kilometers = getKilometers(meters);
        double inches = getInches(meters);
        double feet = getFeet(meters);

        if (menuNum <= 4 && meters > 0) {
            switch (menuNum) {
                case 1 -> {
                    System.out.println(meters + " meters is " + kilometers + " kilometers.");
                    System.out.println("1. Convert to Kilometers");
                    System.out.println("2. Convert to Inches");
                    System.out.println("3. Convert to Feet");
                    System.out.println("4. Quit the Program");
                }
                case 2 -> {
                    System.out.println(meters + " meters is " + inches + " inches.");
                    System.out.println("1. Convert to Kilometers");
                    System.out.println("2. Convert to Inches");
                    System.out.println("3. Convert to Feet");
                    System.out.println("4. Quit the Program");
                }
                case 3 -> {
                    System.out.println(meters + " meters is " + feet + " feet.");
                    System.out.println("1. Convert to Kilometers");
                    System.out.println("2. Convert to Inches");
                    System.out.println("3. Convert to Feet");
                    System.out.println("4. Quit the Program");
                }
                case 4 ->
                    System.out.println("Bye!");
            }
        } else {
            System.out.println("Invalid input for menu number or negative numbers for meters.");
        }
    }

    public static double getKilometers(double meters) {
        return (meters * 0.001);

    }

    public static double getInches(double meters) {
        return (meters * 39.37);

    }

    public static double getFeet(double meters) {
        return (meters * 3.281);

    }
}
