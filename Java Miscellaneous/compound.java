import java.util.*;
public class compound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        Double p = (double) sc.nextInt();
        System.out.println("Enter the rate of interest:");
        Double r = (double) sc.nextInt();
        System.out.println("Enter the time:");
        Double t = (double) sc.nextInt();
        Double a1 = (1+(r/100));
        Double a2 = Math.pow(a1, t);
        Double a3 = p*a2;
        Double CI = a3 - p;
        System.out.println("The Amount is: Rs."+a3);
        System.out.println("The CI is: Rs."+CI);
    }
}
