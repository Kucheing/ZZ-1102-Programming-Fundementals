
import java.util.Scanner;

public class celcius {

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
