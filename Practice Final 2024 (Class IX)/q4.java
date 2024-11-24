public class q4 {
    void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void display(int n) {
        while (n != 0) {
            int d = n % 10;
            System.out.println("sqrt of " + d + " is " + Math.sqrt(d));
            n = n / 10;
        }
    }

    void display(int a, int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + Math.pow(a, i);
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        q4 obj = new q4();
        obj.display();
        obj.display(12345);
        obj.display(2, 5);
    }
}
