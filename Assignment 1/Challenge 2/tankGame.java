
import java.util.Scanner;

public class tankGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Tank Game!");
        System.out.println("In this game, the objective is to collect balls from each small tank into the MainTank.");
        System.out.println("The game will end once all the balls from each tanks are moved into the MainTank.");

        int mainTank = 0;

        System.out.println("Player please enter your name: ");
        String Player = scanner.nextLine();

        System.out.println("Now you will draw random numbers for each small tank, which will be done 3 times. Press Enter to continue.");
        scanner.nextLine();

        // Random number between 0 and 5
        int smallTank1 = getRandomBalls();
        int smallTank2 = getRandomBalls();
        int smallTank3 = getRandomBalls();
        System.out.println(Player + " drew: " + smallTank1 + " balls for smallTank1, " + smallTank2 + " balls for smallTank2, and " + smallTank3 + " balls for smallTank3.");

        displayTanks(smallTank1, smallTank2, smallTank3, mainTank);

        System.out.println("Now all the balls from each small tank will be moved to the MainTank in order.");
        System.out.println("Press Enter to continue.");
        scanner.nextLine();

        smallTank2 = moveBalls(smallTank1, smallTank2, "smallTank1", "smallTank2");
        smallTank1 = 0;
        displayTanks(smallTank1, smallTank2, smallTank3, mainTank);

        smallTank3 = moveBalls(smallTank2, smallTank3, "smallTank2", "smallTank3");
        smallTank2 = 0;
        displayTanks(smallTank1, smallTank2, smallTank3, mainTank);

        mainTank = moveBalls(smallTank3, mainTank, "smallTank3", "MainTank");
        smallTank3 = 0;
        displayTanks(smallTank1, smallTank2, smallTank3, mainTank);

        System.out.println("Congratulations " + Player + "! All balls have been moved to the MainTank. The MainTank now has a total of " + mainTank + " balls.");
        System.out.println("Thank you for playing the Tank Game!");
    }

    public static int getRandomBalls() {
        return (int) (Math.random() * 6); // 0 to 5 number of balls
    }

    public static int moveBalls(int fromTank, int toTank, String fromName, String toName) {
        System.out.println("Moving " + fromTank + " balls from " + fromName + " to " + toName + "...");
        toTank += fromTank;
        return toTank;
    }

    public static void displayTanks(int smallTank1, int smallTank2, int smallTank3, int mainTank) {
        System.out.println("Current state:");
        System.out.println("smallTank1: " + smallTank1 + " balls");
        System.out.println("smallTank2: " + smallTank2 + " balls");
        System.out.println("smallTank3: " + smallTank3 + " balls");
        System.out.println("MainTank: " + mainTank + " balls");
        System.out.println();
    }
}

// Steps to implement the Tank Game:
/*
1. First of all we welcome the player into the game and explain the objective to reach the end of the game
2. Then we ask for the player's name 
3. Next the player will press enter to draw 3 random numbers, each number present the amount of balls for each tank
4. After the player presses enter, this will use the value method to get the random numbers by value method getRandomBalls
5. After we get the random value of numbers for each smalltank, we display the current state of all tanks
6. Then we explain to the player that all the balls from each small tank will be moved to the MainTank in order
7. The player will then press enter to continue
8. We then use the moveBalls method to move the balls from smallTank1 to smallTank2, smallTank2 to smallTank3, and finally smallTank3 to MainTank
9. After each move, we display the current state of all tanks
10. Finally, we congratulate the player for moving all balls to the MainTank and display the total number of balls in the MainTank
11. We thank the player for playing the Tank Game
 */
