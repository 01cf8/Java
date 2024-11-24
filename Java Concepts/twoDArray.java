import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            System.out.println("Enter elements of " + (i + 1) + " row:");
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to search:");
        int num = sc.nextInt();
        System.out.println();

        boolean found = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == num) {
                    System.out.println("Found " + num + " at index (" + i + "," + j + ")");
                    found = true;
                }
            }
            System.out.println();
        }
        if (!found) {
            System.out.println("Entered number does not exist in array");
        }

        sc.close();

    }
}
