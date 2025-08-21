
import java.util.Scanner;

public class predatorPreySims {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial rate at which prey birth exceeds natural death: ");
        double A = input.nextDouble();
        System.out.print("Enter the rate of predation: ");
        double B = input.nextDouble();
        System.out.print("Enter the rate of which predator deaths exceeds births without food: ");
        double C = input.nextDouble();
        System.out.print("Enter the rate of predator increase in the presence of food: ");
        double D = input.nextDouble();

        // Prompt for initial populations
        System.out.print("Initial prey population: ");
        double prey = input.nextDouble();
        System.out.print("Initial predator population: ");
        double pred = input.nextDouble();

        // Prompt for number of periods
        System.out.print("Number of periods to simulate: ");
        int periods = input.nextInt();

        // System.out.printf("%-10s %-15s %-15s%n", "Period", "Prey", "Predator");
        System.out.printf("Period " + periods + " Prey " + prey + " Predator " + pred + "%n");
        // Loop through each period to calculate new populations
        for (int i = 1; i <= periods; i++) {
            double newPrey = prey * (1 + A - B * pred);
            double newPred = pred * (1 - C + D * prey);
            System.out.printf("%-10d %-15.2f %-15.2f%n", i, newPrey, newPred);
            // System.out.printf("Period " + i + " Prey " + newPrey + " Predator " + newPred);
            prey = newPrey;
            pred = newPred;
        }

    }
}
