
import java.util.Scanner;

public class doWhileLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter;
        do {
            System.out.print("Enter a lower case or uppercase letter : ");
            letter = scanner.next().charAt(0);
            if (!Character.isLetter(letter)) {
                System.out.println("Sorry you did not type a letter. Try again");
            }
        } while (!Character.isLetter(letter));
        if (Character.isUpperCase(letter)) {
            System.out.println("You typed an uppercase letter ");
        } else {
            System.out.println("You typed a lowercase letter ");
        }
    }
}

/*
1. Import the Scanner class to allow user input.
2. Define the class doWhileLetters.
3. In the main method, create a Scanner object for input.
4. Declare a variable 'letter' to store the user's input character.
5. Use a do-while loop to repeatedly prompt the user to enter a letter until a valid letter is entered.
6. Inside the loop, check if the input is a letter using Character.isLetter(). If not, display an error message.
7. After a valid letter is entered, check if it is uppercase using Character.isUpperCase().
8. Print whether the user typed an uppercase or lowercase letter.
 */
