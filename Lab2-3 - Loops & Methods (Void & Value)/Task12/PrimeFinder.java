
public class PrimeFinder {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) { // Start from 2, since 1 is not prime
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
