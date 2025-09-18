
import java.util.Scanner;

public class Task11_distance {

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
// Same again like the last task from task10, We are using extended method named distance
// to calculate the distance travelled by a vehicle given its speed and time.
// The formula used is Distance = Speed * Time. 
// In the main method, The program prompts the user to input the Speed and the Time,
// then it calls the distance method to compute and display the distance travelled.
