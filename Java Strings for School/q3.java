import java.util.*;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String s = sc.nextLine();
        s = ' ' + s;
        String str = "";
        String initials = "";

        int l1 = s.lastIndexOf(' ');
        String lastName = s.substring(l1);

        for (int i = 0; i < l1; i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                initials = initials + s.charAt(i + 1) + '.';
            }
        }
        str = initials.concat(lastName);
        System.out.println("New String: " + str);

        sc.close();
    }
}
