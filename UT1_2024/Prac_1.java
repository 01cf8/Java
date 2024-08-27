public class Prac_1 {
    public static void main(String[] args) {
        int num = 1221;
        boolean iseven = false, ispal = false;
        int d = 0, s = 0, r = 0, n = num;
        while (n != 0) {
            d = n % 10;
            r = r * 10 + d;
            s += d;
            n = n / 10;
        }
        if (r == num) {
            ispal = true;
        }
        if (s % 2 == 0) {
            iseven = true;
        }

        if (ispal && iseven) {
            System.out.println("Evenpal no.");
        } else {
            System.out.println("Not an Evenpal no.");
        }
    }
}