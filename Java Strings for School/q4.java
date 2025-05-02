public class q4 {
    // Pig Latin
    public static void main(String[] args) {
        String inputString = "ello ppsi";
        String[] words = inputString.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstLetter = word.charAt(0);

            if (isVowel(firstLetter)) {
                String pigLatinWord = word + "way";
                words[i] = pigLatinWord;
            } else {
                int vowelIndex = 0;
                while (vowelIndex < word.length() && !isVowel(word.charAt(vowelIndex))) {
                    vowelIndex++;
                }
                String consonantCluster = word.substring(0, vowelIndex);
                String restOfWord = word.substring(vowelIndex);
                String pigLatinWord = restOfWord + consonantCluster + "ay";
                words[i] = pigLatinWord;
            }
        }

        String pigLatinSentence = String.join(" ", words);
        System.out.println(pigLatinSentence);
    }

    private static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}