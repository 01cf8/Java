import java.util.*;

@SuppressWarnings("unused")
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Jon");

        System.out.println(sb);

        // set character at index 0
        sb.setCharAt(0, 'R');
        System.out.println(sb);

        // append method to add a character
        sb.append(' ');
        sb.append('S');
        sb.append('m');
        sb.append('i');
        sb.append('t');
        sb.append('h');
        System.out.println(sb);

        // delete characters
        sb.deleteCharAt(0);
        System.out.println(sb);

        // insert a character
        sb.insert(0, 'J');
        sb.insert(2, 'h');
        System.out.println(sb);

        // reverse the string
        sb.reverse();
        System.out.println(sb);
    }
}
