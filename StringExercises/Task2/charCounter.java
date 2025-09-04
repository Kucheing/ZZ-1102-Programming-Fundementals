
import java.util.Scanner; // Import the Scanner class for user input

public class charCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object to read input

        System.out.println("Enter the string: ");
        String chosenStrin = input.nextLine(); // Read the whole line of text from the user

        System.out.println("Enter A character to count from the String: ");
        char chosenCharacte = input.next().charAt(0); // Read the next word and take its first character

        int count = 0; // Initialize a counter for occurrences

        for (int i = 0; i < chosenStrin.length(); i++) { // Loop through each character in the string
            // chosenStrin.length() gives the number of characters in the string
            // chosenStrin.charAt(i) gets the character at position i
            if (chosenStrin.charAt(i) == chosenCharacte) { // Compare current character to the chosen character
                count++; // Increment counter if match found
            }
        }
        System.out.println("The character '" + chosenCharacte + "' appears " + count + " times in the string."); // Output result
    }
}

/*
EXPLANATIONS:
1. Scanner input = new Scanner(System.in);
   - Creates a Scanner object to read input from the keyboard.

2. input.nextLine();
   - Reads an entire line of text (including spaces) entered by the user.

3. input.next().charAt(0);
   - input.next() reads the next word (up to a space or enter).
   - .charAt(0) gets the first character of that word.

4. chosenStrin.length();
   - Returns the number of characters in the string chosenStrin.

5. chosenStrin.charAt(i);
   - Returns the character at index i in the string chosenStrin.
   - Indexing starts from 0.

6. The for loop:
   - Loops from 0 to chosenStrin.length() - 1, checking each character.

7. The if statement:
   - Compares the current character in the string to the chosen character.

8. The counter:
   - Increments each time a match is found.

9. The final print statement:
   - Displays how many times the chosen character appears in the string.
 */
