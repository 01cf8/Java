public class prac4 {
    public static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public static void main(String[] args) {
        String s = "#IMAGINATION@2024";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                str += (char) (ch + 1);
            } else if (!isVowel(ch) && ch <= 'Z' && ch >= 'A') {
                str += (char) (ch - 1);
            } else {
                str += ch;
            }
        }
        System.out.println("Modified String: " + str);
    }
}
