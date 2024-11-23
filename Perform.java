public class Perform {
    public double perform(double r, double h) {
        double csa = Math.PI * r * (r + Math.sqrt(h * h + r * r));
        return csa;
    }

    public void perform(int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((i * c + j + 1) + " ");
            }
            System.out.println();
        }
    }

    public void perform(int m, int n, char ch) {
        if (ch == 'Q') {
            System.out.println(m / n);
        } else if (ch == 'R') {
            System.out.println(m % n);
        } else {
            System.out.println("Invalid character");
        }
    }

    public static void main(String[] args) {
        Perform obj = new Perform();

        // Test perform method with double parameters
        double csa = obj.perform(3.0, 4.0);
        System.out.println("Curved Surface Area of Cone: " + csa);

        // Test perform method with int parameters
        obj.perform(4, 5);

        // Test perform method with int and char parameters
        obj.perform(10, 3, 'Q'); // Output: 3
        obj.perform(10, 3, 'R'); // Output: 1
        obj.perform(10, 3, 'X'); // Output: Invalid character
    }
}