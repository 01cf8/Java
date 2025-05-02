import java.util.Scanner;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get bit
        // int n = 5; // 0101
        // int pos = 3;
        // int bitmask = 1 << pos;
        // if ((bitmask & n) == 0) {
        // System.out.println("Bit was 0");
        // } else {
        // System.out.println("Bit was 1");
        // }

        // Set bit
        // int n = 5; // 0101
        // int pos = 1;
        // int bitmask = 1 << pos;
        // int newNumber = bitmask | n;
        // System.out.println(newNumber);

        // Clear bit
        // int n = 5; // 0101
        // int pos = 2;
        // int bitmask = 1 << pos;
        // int notBitmask = ~bitmask;
        // int newNumber = notBitmask & n;
        // System.out.println(newNumber);

        // Update bit
        System.out.println("Do u wnat to set or clear bit?");
        System.out.println("1. Set");
        System.out.println("2. Clear");
        int ch = sc.nextInt();

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter position:");
        int pos = sc.nextInt();
        if (ch == 1) {
            int bitmask = 1 << pos;
            int newNumber = bitmask | n;
            System.out.println("Result : " + newNumber);
        } else if (ch == 2) {
            int bitmask = 1 << pos;
            int notBitmask = ~bitmask;
            int newNumber = notBitmask & n;
            System.out.println("Result : " + newNumber);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}