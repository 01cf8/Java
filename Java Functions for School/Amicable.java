import java.util.Scanner;

public class Amicable {
    public static void main(String args[]) {
        int s1 = 0, s2 = 0, n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        // reading the first number
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        // reading the second number
        n2 = sc.nextInt();
        for (int i = 1; i < n1; i++) {
            // finds the divisors of the first number
            if (n1 % i == 0) {
                // finds the sum of divisors of the first number
                s1 = s1 + i;
            }
        }
        for (int i = 1; i < n2; i++) {
            // finds the divisors of the second number
            if (n2 % i == 0) {
                // finds the sum of divisors of the second number
                s2 = s2 + i;
            }
        }
        // comparing the sum of divisors with the given numbers
        // returns true if both conditions are true
        if ((n1 == s2) && (n2 == s1)) {
            System.out.println("Amicable numbers.");
        } else {
            System.out.println("Not amicable numbers.");
        }
        sc.close();
    }
}