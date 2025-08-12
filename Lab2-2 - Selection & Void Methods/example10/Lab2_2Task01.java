
import java.util.Scanner;

public class Lab2_2Task01 {

    public static void main(String[] args) {
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value greater than zero: ");
        x = scanner.nextDouble();
        if (x > 0) {
            System.out.printf("x = %.5f%n", x);
            System.out.printf("log10 (x) = %.5f%n", Math.log10(x));
            System.out.printf("ln (x) = %.5f%n", Math.log(x));
            System.out.printf("e^x = %g\n", Math.exp(x));
        } else {
            System.out.println("Error: x <= 0");
        }
    }
}
