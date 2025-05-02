public class Specimen_2024_Q8 {
    void display() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void display(long n) {
        while (n != 0) {
            long d = n % 10;
            System.out.println("Square root of " + d + " is " + Math.sqrt(d));
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        Specimen_2024_Q8 obj = new Specimen_2024_Q8();
        obj.display();
        obj.display(54321);
    }
}
