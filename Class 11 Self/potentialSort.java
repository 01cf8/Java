import java.util.Scanner;
import java.util.StringTokenizer;
public class potentialSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine().toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String[] words = new String[n];
        int[] poten = new int[n];
        for(int i = 0; i<n; i++){
            words[i] = st.nextToken();
            for(int j=0; j<words[i].length(); j++){
                int c = (int) words[i].charAt(j);
                poten[i] += c;
            }
        }
        for(int i = 0; i<n-1;i++){
            for(int j = 0; j<n-i-1; j++){
                if(poten[j]>poten[j+1]){
                    int t = poten[j];
                    poten[j] = poten[j+1];
                    poten[j+1] = t;
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++){
            System.out.print(words[i] + " ");
        }
    }
}
