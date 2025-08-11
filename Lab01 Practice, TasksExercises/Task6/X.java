//Original code
// public class X {
//     public static void main(String[] args) {
//         int x1 = 1, x2 = 2, x3 = 4; int x4 = (x1 + x2 + x3) / 3;
//         System.out.println(x4);
//     }
// }

/*Problems
Logic Error:
Integer division (sum / 3) discards fractional values.
Fix: Use double for the sum or cast before dividing.

Poor Naming:
x1, x2, x3, x4 are meaningless variable names.
Fix: Use descriptive names like num1, num2, num3, average.

Layout & Readability:

No indentation for readability.
No comments explaining purpose. */

//Fixed Code
public class X {
    public static void main(String[] args) {
        
        // Declare and initialize three integers
        int num1 = 1;
        int num2 = 2;
        int num3 = 4;

        // Calculate the average using double to avoid integer division truncation
        double average = (num1 + num2 + num3) / 3.0;

        // Display the result
        System.out.println("The average is: " + average);
    }
}