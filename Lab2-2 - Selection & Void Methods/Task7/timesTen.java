
import java.util.Scanner;

public class timesTen {

    public static void timesTen(double value) {
        System.out.println(value * 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        timesTen(num);
    }
}
