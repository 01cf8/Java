public class q1 {
    public static void main(String[] args) {
        String s = "hello world";
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int a = (int) ch;

            if (ch == 'a' || ch == 'e' || ch == 'e' || ch == 'o' || ch == 'u') {
                str = str + (char) (a + 1);
            } else {
                str = str + ch;
            }
        }
        System.out.println("New String: " + str);
    }
}