
import java.util.Scanner; // Import Scanner for user input

public class IsDupledromeCP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.println("Please enter a word from the Dictionary: ");
        String word = input.nextLine(); // Read the user's input word

        // Print only the boolean result of the dupledrome check
        System.out.println(dupledrome(word));
    }

    public static boolean dupledrome(String word) {
        int length = word.length();
        if (length % 2 != 0) { // here it is just to confirm that the length of the word is even, because if it is odd, it cannot be a dupledrome / like aabbc will not be counted as a dupledrome
            return false; // Odd length words cannot be dupledromes
        }
        for (int i = 0; i < length; i += 2) { //+= 2 to check pairs that there are a double character like aa, bb, cc
            if (word.charAt(i) != word.charAt(i + 1)) {
                return false; // Each pair must be the same
            }
        }
        return true;
    }
}
