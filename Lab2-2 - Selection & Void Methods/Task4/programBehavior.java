
import java.util.Scanner;

public class programBehavior {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        double number = input.nextDouble();

        if (number == 1) {
            Scanner input1 = new Scanner(System.in);
            System.out.print("Input your Length: ");
            double length = input1.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Input your Width: ");
            double width = input2.nextDouble();

            double area = length * width;
            System.out.println("The area is: " + area + " square cm");

            double perimeter = 2 * (length + width);
            System.out.println("The perimeter is: " + perimeter + " cm");

        } else if (number == 2) {

            Scanner input1 = new Scanner(System.in);
            System.out.print("Input your radius of a circle: ");
            double radius = input1.nextDouble();

            double area = Math.PI * radius * radius; //pi*r^2
            System.out.printf("The area is: %.2f square cm\n", area);

            double circumference = 2 * Math.PI * radius; // 2*pi*r
            System.out.printf("The circumference is: %.2f cm\n", circumference);

        } else {
            System.out.println("Error: Wrong menu choice");
        }
    }
}
