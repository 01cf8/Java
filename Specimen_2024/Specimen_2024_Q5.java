import java.util.Scanner;

public class Specimen_2024_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String input = sc.nextLine();
        String uppercaseString = input.toUpperCase();
        int vowelCount = 0;

        for (int i = 0; i < uppercaseString.length(); i++) {
            char ch = uppercaseString.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }

        System.out.println("Uppercase String: " + uppercaseString);
        System.out.println("Number of Vowels: " + vowelCount);
        sc.close();
    }
}