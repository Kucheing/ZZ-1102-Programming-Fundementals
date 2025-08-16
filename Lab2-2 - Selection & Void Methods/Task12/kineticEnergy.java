
import java.util.Scanner;

public class kineticEnergy {

    public static void kineticEnergy(double m, double v) {
        double KE = 0.5 * m * v * v;
        System.out.println("The kinetic energy is " + KE + " joules");
        System.out.println("Or");
        double KE2 = KE / 1000;
        System.out.printf("The kinetic energy is %.2f kilojoules%n", KE2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the object mass in Kilograms: ");
        double mass = input.nextDouble();
        System.out.println("Enter the object velocity in m/s: ");
        double speed = input.nextDouble();
        kineticEnergy(mass, speed);
    }
}
