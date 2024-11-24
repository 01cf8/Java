import java.util.*;

public class prac5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];
        System.out.println("Enter elements:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sumR = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumR += a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumR);
            sumR = 0;
        }
        System.out.println();
        int sumC = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumC += a[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column: " + sumC);
            sumC = 0;
        }
        sc.close();
    }
}
