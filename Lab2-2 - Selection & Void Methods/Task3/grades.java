
import java.util.Scanner;

public class grades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String letterGrade = scanner.next();
        System.out.println("Your letter grade is: " + letterGrade);

        if (letterGrade.equalsIgnoreCase("A") || letterGrade.equalsIgnoreCase("B")) {
            System.out.println("Good Standing");
        } else if (letterGrade.equalsIgnoreCase("C")) {
            System.out.println("O.K. ");
        } else if (letterGrade.equalsIgnoreCase("D") || letterGrade.equalsIgnoreCase("F")) {
            System.out.println("Poor, student is on probation");
        } else {
            System.out.println("Invalid letter grade");
        }

    }
}
