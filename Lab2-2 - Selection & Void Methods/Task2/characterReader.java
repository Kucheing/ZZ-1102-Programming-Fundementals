
import java.util.Scanner;

public class characterReader {

    public static void main(String[] args) {
        String x;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        x = scanner.next();

        if (Character.isLowerCase(x.charAt(0))) {
            System.out.println("The character " + x + " is lowercase");
        } else if (Character.isUpperCase(x.charAt(0))) {
            System.out.println("The character " + x + " is uppercase");
        } else {
            System.out.println("The character " + x + " is a character digit");
            System.out.println("Where " + x + " is the character read from the console/keyboard");
        }
    }
}
