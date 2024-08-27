import java.util.*; 
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter 1 to vote Akshit");
            System.out.println("Enter 2 to vote Shivam");
            System.out.println("Enter 3 to vote Aman");
            System.out.println("Enter 4 to vote Mayank");
            System.out.println("Enter your choice:");
            int vote = sc.nextInt();
           switch (vote) {
            case 1:
                System.out.println("You have voted Akshit");
                break;
            case 2:
                System.out.println("You have voted Shivam");
                break;
            case 3:
                System.out.println("You have voted Aman");
                break;
            case 4:
                System.out.println("You have voted Mayank");
                break;
            default:
            System.out.println("Invalid vote!");
                break;}
       }
    }