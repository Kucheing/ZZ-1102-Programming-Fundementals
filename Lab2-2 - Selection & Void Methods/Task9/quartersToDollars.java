
import java.util.Scanner;

public class quartersToDollars {

    public static void quartersToDollars(int NoOfQuarters) {
        System.out.println(NoOfQuarters * 0.25);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        int num = input.nextInt();
        quartersToDollars(num);
    }
}
