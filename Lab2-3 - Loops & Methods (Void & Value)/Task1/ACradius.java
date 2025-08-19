
import java.util.Scanner;

public class ACradius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius <0 to quit>: ");
        double radius = scanner.nextDouble();

        while (radius <= 0) {
            System.err.print("Invalid radius");
            radius = scanner.nextDouble();
        }

        if (radius > 0) {
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;
            System.out.printf("radius = %.2f cm,", radius);
            System.out.printf("area = %.2f square cm,", area);
            System.out.printf("circumference = %.2f square cm", circumference);
        } else {
            System.err.println("Invalid radius");
        }
    }
}

// made by copilot
// import java.util.Scanner;
// public class ACradius {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double radius;
//         System.out.print("Enter radius <0 to quit>: ");
//         radius = scanner.nextDouble();
//         while (radius >= 0) {
//             double area = Math.PI * radius * radius;
//             double circumference = 2 * Math.PI * radius;
//             System.out.printf("radius = %.2f cm, area = %.2f square cm, circumference = %.2f square cm\n", radius, area, circumference);
//             System.out.print("Enter radius <0 to quit>: ");
//             radius = scanner.nextDouble();
//         }
//         System.out.println("Program ended.");
//     }
// }
