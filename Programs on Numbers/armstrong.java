import java.util.*;

public class armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, originalNumber, remainder;
        double result = 0;

        System.out.println("Enter number:");
        number = sc.nextInt();

        originalNumber = number;

        while (originalNumber!=0) {
            remainder = originalNumber%10;
            result+=Math.pow(remainder,3);
            originalNumber /= 10;
        }

        if (number==result) {
            System.out.println("Armstrong");
        }else{
            System.out.println("Not armstrong");
        }
    }
}