
public class fallingDistance {

    public static void main(String[] args) {

        // Loop from 1 to 10 seconds and display the falling distance for each
        for (int t = 1; t <= 10; t++) {
            double distance = fallingDistance(t);
            System.out.printf("The distance the object has fallen after %d seconds is: %.2f meters%n", t, distance);
        }
    }

    // Method to calculate falling distance for a given time
    public static double fallingDistance(int t) {
        double g = 9.8;
        double Distance = 0.5 * g * t * t;
        return Distance;
    }
}
