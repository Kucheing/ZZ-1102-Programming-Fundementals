
// Import the Scanner class for user input
import java.util.Scanner;

// Class to demonstrate nested loops for pattern printing
public class NestedPattern {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer between 1 and 10
        System.out.print("Enter an integer from 1 to 10:");
        int number = input.nextInt();

        // Outer loop controls the number of rows (from 1 to 'number')
        for (int i = 1; i <= number; i++) {
            // Inner loop prints '*' i times on the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing all '*' for the current row
            System.out.println();
        }
    }

}
