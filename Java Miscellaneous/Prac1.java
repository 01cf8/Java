import java.util.*;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int num = n;
        int r = 0, s = 0;
        while (n != 0) {
            int d = n % 10;
            s = s + d;
            r = r * 10 + d;
            n = n / 10;
        }
        if (num == r && s % 2 == 0) {
            System.out.println("EvenPal number");
        } else {
            System.out.println("Not a EvenPal number");
        }

    }
}
