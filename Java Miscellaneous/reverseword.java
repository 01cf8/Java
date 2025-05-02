import java.util.*;
public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        StringBuffer sb = new StringBuffer(word);
        StringBuffer rev = sb.reverse();
        System.out.println("The reversed word is:"+ rev);
   }
}
