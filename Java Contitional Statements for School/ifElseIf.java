import java.util.*;
public class ifElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age>=18&&age<=110){
            System.out.println("Adult");
        }else if(age>110){
            System.out.println("Why aint you dead yet?");
        }else{
            System.out.println("Not an Adult");
        }
    }
}
