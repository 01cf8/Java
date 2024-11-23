public class Prac2 {
    public static void main(String[] args) {
        int a[] = { 110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033 };
        int n = a.length;

        // Implementing Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = (i + 1); j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}