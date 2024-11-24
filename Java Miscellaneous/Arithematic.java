import java.util.Scanner;

public class Arithematic {
  public static void main(String[] args) {

    char operator;
    Double num1, num2, out;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number");
    num1 = sc.nextDouble();

    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    System.out.println("Enter second number");
    num2 = sc.nextDouble();

    switch (operator) {

      case '+':
        out = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + out);
        break;

      case '-':
        out = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + out);
        break;

      case '*':
        out = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + out);
        break;

      case '/':
        out = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + out);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }
  }

/**
 * @param name
 */
public static void printName(String name){
    System.out.println(name);
    return;
}
}