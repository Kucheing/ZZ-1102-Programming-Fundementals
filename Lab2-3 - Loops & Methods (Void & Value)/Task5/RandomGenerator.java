
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        // Set the seed for the random number generator
        final int a = 32310901;
        final int b = 1729;
        int rold, rnew;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the seed value for random number generation: ");
        rold = input.nextInt();

        for (int i = 0; i < 100; i++) {
            rnew = (a * rold + b); //formula for simple random generator
            System.out.println(rnew);
            rold = rnew;
        }
    }
}
