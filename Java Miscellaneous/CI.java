import java.util.Scanner;
public class CI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double p,r,t,ci,a;
        System.out.println("Enter principal:");
        p = sc.nextDouble();
        System.out.println("Enter rate of interent:");
        r = sc.nextDouble();
        System.out.println("Enter time:");
        t = sc.nextDouble();
        double x = 1+(r/100);
        a = p*Math.pow(x,t);
        ci = a-p;
        System.out.println("The CI is Rs."+ci);
    }
}
