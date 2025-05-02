import java.util.*;

public class product {
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = multiply(num1,num2);
        System.out.println("The product is: "+product);

        sc.close();
    }
}