//Approach 1
import java.util.*;
public class str1 {
    public static void main(String[] args) {
        String str = "Have a great day";
        StringTokenizer st = new StringTokenizer(str);
        int now = st.countTokens();
        String max = "";
        for(int i = 0; i< now; i++){
            String w = st.nextToken();
            if(w.length() > max.length()) {
                max = w;
            }
        }
        System.out.println(max);
    }
}

//Approach 2

// public class str1 {
//     public static void main(String[] args) {
//         String str = "Have a great day";
//         String[] words = str.split("\\s+");
//         String max = "";
//         for (String w : words) {
//             if (w.length() > max.length()) max = w;
//         }
//         System.out.println(max);
//     }
// }
