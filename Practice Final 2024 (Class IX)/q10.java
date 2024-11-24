public class q10 {
    public static void main(String[] args) {
        String str = "kanishk@14#";
        int a = 0, d = 0, s = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                a++;
            } else if (ch >= '0' && ch <= '9') {
                d++;
            } else {
                s++;
            }
        }
        System.out.println("a: " + a);
        System.out.println("d: " + d);
        System.out.println("s: " + s);
    }
}
