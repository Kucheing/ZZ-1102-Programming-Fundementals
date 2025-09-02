
import java.util.Random;
import java.util.Scanner;

public class spellingBee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        // System.out.println("Words given as examples here are " + String.join(", ", words));

        // Selecting a random word from the string 
        String selectedWord = words[random.nextInt(words.length)];

        // Removing a random letter from the selectedWord
        int missingIndex = random.nextInt(selectedWord.length());
        char missingChar = selectedWord.charAt(missingIndex);

        // ReCreate the selectedWord with the missing character replaced by '_'
        StringBuilder displayWord = new StringBuilder(selectedWord);
        displayWord.setCharAt(missingIndex, '_');

        System.out.println("Guess the missing letter: " + displayWord);
        System.out.print("Your guess: ");
        char guess = input.next().charAt(0);

        if (guess == missingChar) {
            System.out.println("Correct! The word is: " + selectedWord);
        } else {
            System.out.println("Incorrect. The missing letter was '" + missingChar + "'. The word is: " + selectedWord);
        }
    }
}
