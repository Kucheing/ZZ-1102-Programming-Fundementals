
import java.util.Scanner;

public class getWLRectangle {

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
    }

    private static double getLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        return input.nextDouble();
    }

    private static double getWidth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        return input.nextDouble();
    }

    private static double getArea(double length, double width) {
        double area = length * width;
        System.out.printf("The area of the rectangle is: %.2f%n", area);
        return area;
    }

    private static void displayData(double length, double width, double area) {
        System.out.printf("The entered Length is: %.2f%nThe entered Width is: %.2f%nThe area is: %.2f%n", length, width, area);
    }
}
