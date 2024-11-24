import java.util.*;

public class q3 {
    String name;
    int age;
    double term, P_amt, amt, interest;

    q3() {
        name = "";
        age = 0;
        term = 0.0;
        P_amt = 0.0;
        amt = 0.0;
        interest = 0.0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.print("Enter the term (in years): ");
        term = sc.nextDouble();
        System.out.print("Enter the principal amount: ");
        P_amt = sc.nextDouble();
    }

    void calculate() {
        if (term <= 1) {
            interest = P_amt * .08 * term;
        } else if (term >= 1 && term <= 3) {
            interest = (P_amt * .08 * 1) + P_amt * 0.12 * (term - 1);
        } else if (term > 3) {
            interest = (P_amt * .08 * 1) + (P_amt * 0.12 * 2) + P_amt * 0.20 * (term - 3);
        }
        amt = P_amt + interest;
    }

    void display() {
        System.err.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Term: " + term + " years");
        System.out.println("Principal: " + P_amt);
        System.out.println("Interest " + interest);
        System.out.println("Total amount: " + amt);
    }

    public static void main(String[] args) {
        q3 obj = new q3();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
