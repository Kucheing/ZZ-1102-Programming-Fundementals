
import java.util.Scanner; // Import Scanner for user input

public class isPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.println("Please enter a word from the Dictionary: ");
        String word = input.nextLine(); // Read the user's input word

        if (isPalindrome(word)) { // Call isPalindrome method to check the word
            System.out.println(word + " is a palindrome."); // If true, print this
        } else {
            System.out.println(word + " is not a palindrome."); // If false, print this
        }
    }

    // Method to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        int length = word.length(); // Get the length of the word
        for (int i = 0; i < length / 2; i++) { // Only need to check up to the middle
            // Compare character from start and end
            if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(length - 1 - i))) {
                return false; // If any pair doesn't match, it's not a palindrome
            }
        }
        return true; // All pairs matched, so it's a palindrome
    }
}
