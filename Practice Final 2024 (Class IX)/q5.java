public class q5 {
    public static void main(String[] args) {
        int n = 6;
        boolean isPronic = false;
        for (int i = 1; i <= n; i++) {
            if (i * (i + 1) == n) {
                isPronic = true;
                break;
            }
        }
        if (isPronic == true) {
            System.out.println("Pronic number");
        } else {
            System.out.println("Not a pronic number");
        }
    }
}
