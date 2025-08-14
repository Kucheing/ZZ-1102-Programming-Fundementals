
import java.util.Scanner;

public class distance {

    public static void distance(double speed, double time) {
        double distance = speed * time;
        System.out.println("The Distance the vehicles travelled is: " + distance + " km");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed in km/h: ");
        double speed = input.nextDouble();
        System.out.println("Enter the time in hours: ");
        double time = input.nextDouble();
        distance(speed, time);
    }
}
