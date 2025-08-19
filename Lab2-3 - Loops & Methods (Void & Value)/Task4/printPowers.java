
// Class to print all powers of 2 from 2^0 to 2^20
public class printPowers {

    public static void main(String[] args) {
        // Loop from 0 to 20 (inclusive) to represent the exponent
        for (int i = 0; i <= 20; i++) {
            // Calculate 2 raised to the power of i
            long power = (long) Math.pow(2, i);
            // Print the result in the format: 2^i = value
            System.out.println("2^" + i + " = " + power);
        }
    }
}
