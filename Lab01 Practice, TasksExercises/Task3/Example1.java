/*Example 1: The following program assigns two values to num1 and num2 and prints the
following:
 Their sum
 Their difference
 Their product
 Their average*/

// public class Example1 {
// public static void main(String[] args) {
//         int num1 = 15; 
//         int num2 = 19;

//         // Display results
//         System.out.println("The Sum is: " + (num1 + num2));
//         System.out.println("The difference is: " + (num1 - num2));
//         System.out.println("The product is: " + (num1 * num2));
//         System.out.println("The average is: " + ((num1 + num2) / 2.0));
// }
// }

/* computes the sum, difference, product of two integer numbers */
public class Example1 {
    public static void main(String[] args) {
        int num1 = 15; int num2 = 19;
        int sum, diff, product;

        double average;
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        average = (num1 + num2) / 2;

        // Display results
        System.out.println("The Sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);

    }
    }
// Comments
// the style of the code on the first example is more forward and simple, it directly assigns the values to num1 and num2 and then calculates the results in the print statements.
// The second example is more structured, it declares variables for sum, diff, product, and average before calculating them. This makes the code more readable and maintainable, especially if the calculations become more complex in the future.