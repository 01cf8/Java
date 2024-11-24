public class test5 {
    public static void main(String[] args) {
        int n = 1021;
        String str = Integer.toString(n);
        int len = str.length();

        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            n = n / 10;
        }

        if (sum == len) {
            System.out.println("SuperSpy Number");
        } else {
            System.out.println("Not a SuperSpy Number");
        }
    }
}
