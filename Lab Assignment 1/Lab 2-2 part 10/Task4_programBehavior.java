
import java.util.Scanner;

public class Task4_programBehavior {

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
// Here we will be using user input for the variables length, width and radius and choosing of number from the menu
// We will be using if-elseif-else selection statements to determine which block of code
// First, asking the number for the menu choice
// if using input number other than 1 or 2, it will print an error message which can be seen at the end of the code
// If the user inputs 1, Then we will be calculating the area and perimeter of a rectangle, But we will need the user input of length and width to be able to calculate the Area and Perimeter
// If the user inputs 2, we will be calculating the area and circumference of a circle, Here we will need the user input of radius to be able to calculate the Area and Circumference
// We will be using Math.PI for the value of pi
