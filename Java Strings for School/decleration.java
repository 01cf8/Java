import java.util.*;

class decleration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        // length
        int len = str.length();
        System.out.println("Length: " + len);

        // // charAt
        // for (int i = 0; i < len; i++) {
        // System.out.println("Character at index " + i + ": " + str.charAt(i));
        // }

        // // compare
        // String str1 = "Hello";
        // String str2 = "Hello";
        // if (str1.compareTo(str2) == 0) {
        // System.out.println("Equal result");
        // } else {
        // System.out.println("Unequal result");
        // }

        // substring
        String subStr = str.substring(0, 7);
        System.out.println("Substring: " + subStr);

        sc.close();
    }
}