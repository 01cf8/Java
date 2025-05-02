import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=100000,withdraw,deposit;
        while(true){
            System.out.println("Automatic Teller Machine");
            System.out.println("Choose 1 for Withdrawal");
            System.out.println("Choose 2 for Depositing");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to EXIT");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter amount to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance>=withdraw){
                    balance = balance-withdraw;
                    System.out.println("Please collect your money...");
                    System.out.println("");
                }
                else{
                    System.out.println("Insufficient Balance!!!");
                    System.out.println("");
                }
                    break;
                case 2:
                System.out.println("Enter the money to be deposited:");
                deposit = sc.nextInt();
                balance = balance+deposit;
                System.out.println("Your money has been deposited!");
                System.out.println("");
                break;
                case 3:
                System.out.println("Your balance is Rs."+balance);
                System.out.println("");
                break;
                case 4:
                System.exit(0);
                    break;
            }
        }
    }
}
