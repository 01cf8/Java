import java.util.Scanner;

class BubbleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the String array: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = new String[n];

        System.out.println("Enter the elements of the String array:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (s[j].compareTo(s[j + 1]) > 0) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        // Display the sorted array
        System.out.println("\nSorted array:");
        for (String str : s) {
            System.out.println(str);
        }
    }
}
