
import java.util.Scanner;

public class kineticEnergy {

    public static void kineticEnergy(double m, double v) {
        double KE = 0.5 * m * v * v;
        System.out.println("The kinetic energy is " + KE + "joules");
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
