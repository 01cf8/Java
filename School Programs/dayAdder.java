import java.util.Scanner;
public class dayAdder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] monthNames = { 
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter number of days to add: ");
        int daysToAdd = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        int[] daysInMonth = {
            31, isLeap ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid date input");
            System.exit(0);
        }

        day += daysToAdd;

        while (day > daysInMonth[month - 1]) {
            day -= daysInMonth[month - 1];
            month++;
            if (month > 12) {
                month = 1;
                year++;
                isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                daysInMonth[1] = isLeap ? 29 : 28;
            }
        }

        System.out.println("New Date = " + day + " " + monthNames[month - 1] + " " + year);
        sc.close();
    }
}
