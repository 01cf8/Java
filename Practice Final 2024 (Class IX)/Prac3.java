import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight:");
        int w = sc.nextInt();

        double cost = 0.0;

        if (w <= 10) {
            cost = 20 * w;
        } else if (w > 10 && w <= 30) {
            cost = 200 + ((w - 10) * 10);
        } else if (w > 30 && w >= 50) {
            cost = 200 + 200 + ((w - 30) * 8);
        } else {
            cost = 200 + 200 + 160 + ((w - 50) * 5);
        }
        System.out.println("The cost is Rs." + cost);
    }
}
