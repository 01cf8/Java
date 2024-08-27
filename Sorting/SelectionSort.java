import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Array: " + Arrays.toString(array));

        exchangeSelectionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void exchangeSelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Swap arr[i] and arr[minIndex]
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}