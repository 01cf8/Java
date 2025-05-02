import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1, 2, 3:");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Namaste!");
                break;
            case 3:
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}