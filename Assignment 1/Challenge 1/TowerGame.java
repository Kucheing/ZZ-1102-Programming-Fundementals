
import java.util.Scanner;

public class TowerGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Tower Game!");
        System.out.println("In this game, two players will be participating, with each taking turn to draw two random numbers.");
        System.out.println("And the first player to reach 10 levels will win the tower game.");

        System.out.print("Decide who will be player 1 and player 2, Enter your name please: ");
        String Player1 = scanner.nextLine();

        System.out.print("Player 2, Enter your name please: ");
        String Player2 = scanner.nextLine();

        int player1Level = 0;
        int player2Level = 0;
        int TOP_LEVEL = 10;

        while (player1Level < TOP_LEVEL && player2Level < TOP_LEVEL) {
            System.out.println(Player1 + ", it's your turn. Press Enter to draw two random numbers.");
            scanner.nextLine();
            int num1 = (int) (Math.random() * 6) + 1; // Random number between 1 and 6
            int num2 = (int) (Math.random() * 6) + 1; // Random number between 1 and 6
            System.out.println(Player1 + " drew: " + num1 + " and " + num2);
            int addup = num1 + num2;

            if (addup % 2 == 0) {
                player1Level += 1;
                System.out.println(Player1 + " drew a pair! You move up 1 level.");
            } else {
                player1Level -= 1;
                System.out.println(Player1 + " move down 1 level.");
            }
            if (player1Level < 0) {
                player1Level = 0; // Ensure level doesn't go below 0
            }
            System.out.println(Player1 + " current level: " + player1Level);
            System.out.println();

            // ----------------------------------------------------------------------------------------------------
            System.out.println(Player2 + ", it's your turn. Press Enter to draw two random numbers.");
            scanner.nextLine();
            int num3 = (int) (Math.random() * 6) + 1; // Random number between 1 and 6
            int num4 = (int) (Math.random() * 6) + 1; // Random number between 1 and 6
            System.out.println(Player2 + " drew: " + num3 + " and " + num4);
            int addup2 = num3 + num4;

            if (addup2 % 2 == 0) {
                player2Level += 1;
                System.out.println(Player2 + " drew a pair! You move up 1 level.");
            } else {
                player2Level -= 1;
                System.out.println(Player2 + " move down 1 level.");
            }
            if (player2Level < 0) {
                player2Level = 0; // Ensure level doesn't go below 0
            }
            System.out.println(Player2 + " current level: " + player2Level);
            System.out.println();
        }

        if (player1Level >= TOP_LEVEL) {
            System.out.println("Congratulations " + Player1 + "! You have reached the top level and won the game!");
        } else if (player2Level >= TOP_LEVEL) {
            System.out.println("Congratulations " + Player2 + "! You have reached the top level and won the game!");
        } else {
            System.out.println("The game continues. Keep playing to reach the top level!");
        }

    }
}
