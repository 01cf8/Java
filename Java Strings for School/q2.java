public class q2 {
    public static void main(String[] args) {
        String s = "hello world";
        int wh = 0, wo = 0, chc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                wh++;
            }
            wo += wh;
        }
        chc = s.length() - wh;

        System.out.println("wh: " + wh);
        System.out.println("wo: " + wo);
        System.out.println("chc: " + chc);

    }
}
