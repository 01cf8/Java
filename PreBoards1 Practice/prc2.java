import java.util.*;

public class prc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to find:");
        int num = sc.nextInt();
        int lb = 0, ub = n - 1, mid = 0;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (arr[mid] == num) {
                System.out.println("Search Successfull");
                System.exit(0);
            }
            if (arr[mid] > num) {
                ub = mid - 1;
            }
            if (arr[mid] < num) {
                lb = mid + 1;
            }
        }
        System.out.println("Search Unsuccessful");
    }
}