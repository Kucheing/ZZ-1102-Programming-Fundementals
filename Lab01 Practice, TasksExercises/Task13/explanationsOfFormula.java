//example we use x = 7.5 and y = 2.0
public class explanationsOfFormula {
    public static void main(String[] args) {
        // Step 1: Initialise variables
        double x = 7.5;
        double y = 2.0;

        // Step 2: Calculate using given formula
        double result = Math.PI * Math.max(4 * y, Math.abs(x - y));

        // Step 3: Print the result
        System.out.println("Result: " + result);

        // Step 4: Explain what Math.PI, Math.max, Math.abs do
        System.out.println("\nExplanations:");
        System.out.println("Math.PI  -> Represents the value of π (pi ≈ 3.141592653589793).");
        System.out.println("Math.max -> Returns the larger of two numbers."); // where here the answer will be math.max(8.0, 5.5) meaning the higher value is 8.0)
        System.out.println("Math.abs -> Returns the absolute value (positive) of a number."); // where here the answer will be math.abs(5.5) meaning the positive value is 5.5)
    }
}
