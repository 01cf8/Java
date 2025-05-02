import java.util.*;

public class sum {
    public static int add(int a, int b){
        int add = a + b;
        return add;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = add(num1,num2);
        System.out.println("The sum is: "+sum);

        sc.close();
    }
}