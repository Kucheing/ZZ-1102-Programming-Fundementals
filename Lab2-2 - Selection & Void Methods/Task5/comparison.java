// Both are correct but mine is made poorly and its better to follow the one made by copilot
// this is the one i made 
//import java.util.Scanner;

// public class comparison {
//     public static void main(String[] args) {
//         Scanner input1 = new Scanner(System.in);
//         System.out.println("Input for string1: ");
//         int str1 = input1.nextInt();
//         Scanner input2 = new Scanner(System.in);
//         System.out.println("Input for string2: ");
//         int str2 = input2.nextInt();
//         if (str1 == str2) {
//             System.out.println("str1 and str2 are equal");
//         } else if (str1 > str2) {
//             System.out.println("str1 is greater than str2");
//         } else if (str1 < str2) {
//             System.out.println("str1 is less than str2");
//         }
//     }
// }
//second example this is done by copilot
import java.util.Scanner;

public class comparison {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println(str1 + " and " + str2 + " are equal");
        } else if (result > 0) {
            System.out.println(str1 + " is greater than " + str2);
        } else {
            System.out.println(str1 + " is less than " + str2);
        }
    }
}
