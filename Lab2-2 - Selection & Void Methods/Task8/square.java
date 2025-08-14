
import java.util.Scanner;

public class square {

    public static void square(int value) {
        System.out.println(value * value);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        square(num);
    }
}
