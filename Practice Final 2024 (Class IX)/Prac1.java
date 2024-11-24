import java.util.Scanner;

public class Prac1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (j % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}