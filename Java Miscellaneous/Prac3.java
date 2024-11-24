import java.util.*;

public class Prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gmail address: ");
        String s = sc.next();
        boolean isValid = isValidGmailId(s);
        if (isValid) {
            System.out.println("Valid Gmail id");
        } else {
            System.out.println("Invalid Gmail id");
        }
    }

    public static boolean isValidGmailId(String gmailId) {
        boolean hasAtSymbol = false;
        boolean hasDot = false;
        boolean hasGmail = false;
        boolean hasCom = false;

        for (int i = 0; i < gmailId.length(); i++) {
            char ch = gmailId.charAt(i);
            if (ch == '@') {
                hasAtSymbol = true;
            } else if (ch == '.') {
                hasDot = true;
            } else if (gmailId.substring(i).startsWith("gmail")) {
                hasGmail = true;
                i += 4; // Skip the 'gmail' characters
            } else if (gmailId.substring(i).startsWith("com")) {
                hasCom = true;
                i += 2; // Skip the 'com' characters
            }
        }

        return hasAtSymbol && hasDot && hasGmail && hasCom;
    }
}