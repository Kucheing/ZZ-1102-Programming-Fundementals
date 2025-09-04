
import java.util.Scanner; // Import Scanner for user input

public class isDupledrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.println("Please enter a word from the Dictionary: ");
        String word = input.nextLine(); // Read the user's input word

        if (dupledrome(word)) { // Call dupledrome method to check the word
            System.out.println(word + " is a dupledrome."); // If true, print this
        } else {
            System.out.println(word + " is not a dupledrome."); // If false, print this
        }
    }

    // Method to check if a word is a dupledrome
    public static boolean dupledrome(String word) {
        int length = word.length(); // Get the length of the word
        if (length % 2 != 0) { // If the word has odd length, it can't be a dupledrome
            return false;
        }
        // Loop through the word, checking each pair of letters
        for (int i = 0; i < length; i += 2) {
            if (word.charAt(i) != word.charAt(i + 1)) { // If a pair is not the same
                return false; // Not a dupledrome
            }
        }
        return true; // All pairs matched, so it's a dupledrome
    }
}

/*
EXPLANATION:
- The program asks the user to enter a word.
- It checks if the word is a "dupledrome" (every two adjacent letters are the same, e.g. "aabbcc").
- If the word's length is odd, it can't be a dupledrome.
- The loop checks each pair of letters (positions 0&1, 2&3, etc.).
- If all pairs are the same, it prints that the word is a dupledrome.
- If any pair is different, it prints that the word is not a dupledrome.

KEY METHODS:
- word.length(): Returns the number of characters in the word.
- word.charAt(i): Returns the character at position i in the word.
- input.nextLine(): Reads a full line of user input.
*/
