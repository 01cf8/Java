import java.util.Scanner;
public class factorial
{
    public static int findFactorial(int num)
    {
        if(num==0)
        return 1;
        else if(num==1)
        return 1;
        else
        return num*findFactorial(num-1);        
    }
  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();   
        if(num>=0) 
        {
          
           int factorial=findFactorial(num);
           System.out.println("The factorial of the entered number is: "+factorial);
        }        
        else
        {
            System.out.println("Factorial not possible.");
            System.out.println("Please enter valid input.");
        } 

        sc.close();
    }
}