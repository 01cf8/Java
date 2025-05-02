import java.util.Scanner;
public class Methodoverloading {
    public static int mySum(int x,int y){
        int z = x+y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("The sum of the two numbers is:"+mySum(a, b));
    }
}
