import java.util.Scanner;
public class daytoDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of days:");
        int day = sc.nextInt();
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int[] daysinMonth = {
            31,isLeap?29:28,31,30,31,30,31,31,30,31,30,31
        };
        String[] monthNames = { 
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int maxDays = isLeap?366:365;
        if(day>maxDays || day<1){
            System.out.println("Invalid input");
            System.exit(0);
        }
        int month = 0;
        while(day>daysinMonth[month]){
            day = day - daysinMonth[month];
            month++;
        }
        System.out.println("Date = "+day+" "+monthNames[month]+" "+year);
        sc.close();
    }
}
