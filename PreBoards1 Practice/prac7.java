public class prac7 {
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        String s = "chart";
        String str = " ";
        s = s.toLowerCase();
        if (isVowel(s.charAt(0))) {
            str = s + "way";
        } else {
            int vIndex = 0;
            while (vIndex < s.length() && !isVowel(s.charAt(vIndex))) {
                vIndex++;
            }
            String move = s.substring(0, vIndex);
            String stay = s.substring(vIndex);
            str = stay + move + "ay";
        }

        System.out.println("Original String: " + s);
        System.out.println("Piglatin Form: " + str);
    }
}
