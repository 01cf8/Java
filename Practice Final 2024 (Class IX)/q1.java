public class q1 {
    public static void main(String[] args) {
        String str = "Aavyavrat Singh Rawat";
        str = ' ' + str;
        int l1 = str.lastIndexOf(' ');
        String s1 = str.substring(l1 + 1);
        String s2 = "";
        for (int i = 0; i < l1; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                s2 = s2 + str.charAt(i + 1) + '.';
            }
        }
        System.out.println("Edited String: " + s2.concat(s1));
    }
}
