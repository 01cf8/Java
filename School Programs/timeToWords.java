import java.util.Scanner;

public class timeToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in 12 hour format (HH:MM): ");
        String time = sc.nextLine();

        if (!time.contains(":")) {
            System.out.println("Invalid format. Use HH:MM.");
            System.exit(0);
        }

        int pos = time.indexOf(':');
        int h = Integer.parseInt(time.substring(0, pos));
        int m = Integer.parseInt(time.substring(pos + 1));

        String hr[] = {"One", "Two", "Three", "Four", "Five", "Six",
                       "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"};
        String min[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
                        "Twenty", "Twenty-One", "Twenty-Two", "Twenty-Three", "Twenty-Four", "Twenty-Five", "Twenty-Six", "Twenty-Seven", "Twenty-Eight", "Twenty-Nine",
                        "Thirty", "Thirty-One", "Thirty-Two", "Thirty-Three", "Thirty-Four", "Thirty-Five", "Thirty-Six", "Thirty-Seven", "Thirty-Eight", "Thirty-Nine",
                        "Forty", "Forty-One", "Forty-Two", "Forty-Three", "Forty-Four", "Forty-Five", "Forty-Six", "Forty-Seven", "Forty-Eight", "Forty-Nine",
                        "Fifty", "Fifty-One", "Fifty-Two", "Fifty-Three", "Fifty-Four", "Fifty-Five", "Fifty-Six", "Fifty-Seven", "Fifty-Eight", "Fifty-Nine"};

        if (h > 12 || h <= 0 || m < 0 || m >= 60) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        if (m == 0) {
            System.out.println(hr[h - 1] + " o' clock");
        } else if (m <= 30) {
            String hour = hr[h - 1];
            String minute = min[m - 1];
            if (m == 15) {
                System.out.println("Quarter past " + hour);
            } else if (m == 30) {
                System.out.println("Half an hour past " + hour);
            } else {
                System.out.println(minute + " minutes past " + hour);
            }
        } else {
            String hour = hr[h % 12];
            String minute = min[60 - m - 1];
            if (m == 45) {
                System.out.println("Quarter to " + hour);
            } else {
                System.out.println(minute + " minutes to " + hour);
            }
        }
    }
}
