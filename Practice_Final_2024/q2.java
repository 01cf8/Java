public class q2 {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    }

    public static void main(String[] args) {
        String str = "chart";
        String res = "";
        char ch = str.charAt(0);
        if (isVowel(ch)) {
            res = str + "way";
        } else {
            int vIndex = 0;
            while (vIndex < str.length() && !isVowel(str.charAt(vIndex))) {
                vIndex++;
            }
            String rest = str.substring(vIndex);
            String move = str.substring(0, vIndex);
            res = rest + move + "ay";
        }
        System.out.println("Pig Latin: " + res);
    }
}
