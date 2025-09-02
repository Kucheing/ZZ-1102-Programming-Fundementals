
import java.util.Scanner;

public class ageCondition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 1 && age <= 9) {
            System.out.println("You are an infant.");
        } else if (age >= 10 && age <= 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 19 && age <= 30) {
            System.out.println("You are a youth.");
        } else if (age >= 31 && age <= 60) {
            System.out.println("You are an adult.");
        } else if (age >= 61 && age <= 100) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}
