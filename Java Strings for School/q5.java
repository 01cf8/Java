public class q5 {
    static void print() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void print(int n) {
        int osum = 0, esum = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                esum += digit;
            } else {
                osum += digit;
            }
            n /= 10;
        }
        if (esum == osum) {
            System.out.println("Lead Number");
        } else {
            System.out.println("Not a Lead Number");
        }
    }

    public static void main(String[] args) {
        print();
        print(3669);
    }
}
