import java.util.Scanner;

public class wrdToASCII {
    String wrd;
    int len;

    wrdToASCII() {
        wrd = "";
        len = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        wrd = sc.nextLine();
        len = wrd.length();

        sc.close();
    }

    void find() {
        int lowest = 1000;
        int highest = 0;

        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            System.out.println(ch + " = " + (int) ch);

            if ((int) ch < lowest) {
                lowest = ch;
            }
            if ((int) ch > highest) {
                highest = ch;
            }
        }

        System.out.println("Lowest ASCII code: " + lowest);
        System.out.println("Highest ASCII code: " + highest);
    }

    void show() {
        System.out.println("Original word: " + wrd);
        find();
    }

    public static void main(String[] args) {
        wrdToASCII obj = new wrdToASCII();
        obj.accept();
        obj.show();
    }
}
