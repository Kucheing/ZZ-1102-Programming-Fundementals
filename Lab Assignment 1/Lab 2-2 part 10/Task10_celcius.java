
import java.util.Scanner;

public class Task10_celcius {

    public static void fahrenheitTocelcius(int fahrenheit) {
        System.out.println(5.0 / 9 * (fahrenheit - 32));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        int fahrenheit = input.nextInt();
        fahrenheitTocelcius(fahrenheit);
    }
}
// This program converts temperaature from Fahrenheit to Celsius using a method.
// By using the formula given to us in the lab assignment. C = 5/9 * (F - 32)
// 1. Import the Scanner class to allow user input.
// 2. To make it cleaner here we will create an extended method name fahrenheitTocelcius which  we can use in the main method later on
// 3. Calculate the extended method by using the formula given to us in the lab assignment
// 4. in the main method we will create a scanner object to read input from the user
// 5. Prompting the user to enter the temperature in Fahrenheit
