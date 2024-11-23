import java.util.Scanner;

public class Specimen_2024_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        String str = Integer.toString(number);
        int l = str.length();
        if (l == 3) {
            int hundredsDigit = number / 100;
            int tensDigit = (number % 100) / 10;
            int onesDigit = number % 10;

            if (hundredsDigit == 0 || tensDigit == 0 || onesDigit == 0) {
                System.out.println(number + " is a duck number.");
            } else {
                System.out.println(number + " is not a duck number.");
            }
        } else {
            System.out.println(number + " is not a three-digit number.");
        }
        sc.close();
    }
}