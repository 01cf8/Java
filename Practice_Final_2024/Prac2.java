import java.util.Scanner;

public class Prac2 {

    int l, b, area, peri;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        l = sc.nextInt();
        System.out.println("Enter breadth:");
        b = sc.nextInt();

        sc.close();
    }

    public void compute() {
        area = l * b;
        peri = 2 * (l + b);
    }

    public void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + peri);
    }

    public static void main(String[] args) {

        Prac2 obj = new Prac2();

        obj.input();
        obj.compute();
        obj.display();
    }
}