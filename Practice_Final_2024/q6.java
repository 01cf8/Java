import java.util.Scanner;

public class q6 {
    public static boolean Strong(int n) {
        boolean isStrong = false;
        int sum = 0;
        int lastDigit = n % 10;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            n = n / 10;
        }
        if (n % 5 == 0 && sum % 7 == 0 && lastDigit == 2) {
            isStrong = true;
        }
        return isStrong;
    }

    public static void Series() {
        int n = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " term: " + n);
            n += i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice: ");
        System.out.println("1. to check for Strong numbers, 2. to print the series.");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if (Strong(num) == true) {
                    System.out.println(num + " is a Strong number.");
                } else {
                    System.out.println(num + " is not a Strong number.");
                }
                break;
            case 2:
                Series();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
