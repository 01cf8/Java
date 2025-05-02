import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = sc.next();
        System.out.println("Enter your last name:");
        String lastName = sc.next();

        // Concatenation
        String name = firstName + " " + lastName;

        System.out.println("Your name is: " + name);
        // str.length() method
        System.out.println("Your name is: " + (name.length() - 1) + " characters long");

        // Printing all characters
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // compareTo() function
        String str = "John Smith";
        if (name.compareTo(str) == 0) {
            System.out.println("Equal Strings");
        } else {
            System.out.println("Not equal Strings");
        }

        sc.close();
    }
}
