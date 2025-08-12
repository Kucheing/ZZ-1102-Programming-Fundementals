
import java.util.Scanner;

public class integerNumbers {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        x = scanner.nextInt();
        System.out.println("You entered: " + x);
        System.out.print("Enter another integer: ");
        y = scanner.nextInt();
        System.out.println("You entered: " + y);

        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("You have entered two even numbers.");
        } else if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("You have entered two odd numbers.");
        } else {
            System.out.println("You have entered one even number and one odd number.");
        }
    }
}
