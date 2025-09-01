
import java.util.Scanner;

public class profitFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number of Shares: ");
        int NS = input.nextInt();

        System.out.println("Enter the Purchase Price per share: ");
        double PP = input.nextDouble();

        System.out.println("Enter the purchase commission paid: ");
        double PC = input.nextDouble();

        System.out.println("Enter the sale price per share: ");
        double SP = input.nextDouble();

        System.out.println("Enter the sale commission paid: ");
        double SC = input.nextDouble();

        double ProfitOrLoss = ((NS * SP) - SC) - ((NS * PP) + PC);

        if (ProfitOrLoss > 0) {
            System.out.println("Sale of a stock is profitable. Profiting: " + ProfitOrLoss);
        } else {
            System.out.println("Sale of a stock has resulted in a loss. Loss: " + ProfitOrLoss);
        }
    }
}
