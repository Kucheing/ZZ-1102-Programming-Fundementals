/*Example 2: The following program shows the difference between System.out.print() and
System.out.println(). Pay attention to the spaces. Try and run: What happens when you remove
space in the first print statement?*/

//         public class Example2 {
//     public static void main(String[] args) {
//         System.out.print("Goodbye, ");
//         System.out.println("cruel world!");
//     }
// }

    public class Example2 {
    public static void main(String[] args) {
        System.out.print("Goodbye,");
        System.out.println("cruel world!");
    }
}

// Comments
// if i remove the space in the first print statement, the output will be:
// Goodbye,cruel world!
// Because the print statement does not add a new line, the second statement will continue on the same line and as there is no spaces it will just be one continuous line.