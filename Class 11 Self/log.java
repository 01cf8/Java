import java.util.Scanner;

public class log {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input times
        System.out.print("Enter login time (HH:mm): ");
        String loginInput = sc.next();
        System.out.print("Enter logout time (HH:mm): ");
        String logoutInput = sc.next();

        // Split and parse
        String[] loginParts = loginInput.split(":");
        String[] logoutParts = logoutInput.split(":");

        int loginHour = Integer.parseInt(loginParts[0]);
        int loginMinute = Integer.parseInt(loginParts[1]);

        int logoutHour = Integer.parseInt(logoutParts[0]);
        int logoutMinute = Integer.parseInt(logoutParts[1]);

        // Convert to minutes since 00:00
        int loginTotal = loginHour * 60 + loginMinute;
        int logoutTotal = logoutHour * 60 + logoutMinute;

        // If logout is before login → next day
        if (logoutTotal < loginTotal) {
            logoutTotal += 24 * 60;
        }

        // Work duration
        int workedMinutes = logoutTotal - loginTotal;
        int hours = workedMinutes / 60;
        int minutes = workedMinutes % 60;

        System.out.printf("You worked for %d hours and %d minutes.%n", hours, minutes);

        sc.close();
    }
}
