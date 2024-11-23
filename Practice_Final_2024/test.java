import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Convert the sentence to uppercase
        sentence = sentence.toUpperCase();

        int wordCountWithVowelStart = 0; // Counter for words starting with vowels
        boolean newWord = true; // To track if we are at the start of a word
        String modifiedSentence = ""; // To store the final output as a string

        // Process each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Check if the current character is a space
            if (ch == ' ') {
                modifiedSentence += ch; // Append space
                newWord = true; // Next character will be the start of a new word
            } else {
                if (newWord) { // If it's the start of a new word
                    newWord = false;

                    // Check if the first character is a vowel
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        wordCountWithVowelStart++; // Increase vowel start word count

                        // Replace vowel with the next alphabet
                        char nextCh = (char) (ch + 1);
                        modifiedSentence += nextCh; // Append the next alphabet after vowel
                    } else {
                        modifiedSentence += ch; // Append the original character
                    }
                } else {
                    modifiedSentence += ch; // Continue appending the rest of the word
                }
            }
        }

        // Print the modified sentence and the count of words starting with a vowel
        System.out.println(modifiedSentence);
        System.out.println(wordCountWithVowelStart + " words started with a vowel");
    }
}
