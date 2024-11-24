import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " element:");
            array[i] = sc.nextInt();
        }

        // Sorting the array
        Arrays.sort(array);

        // Printing the sorted array
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}