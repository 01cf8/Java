import java.util.Scanner;
public class evil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<2||n>100){
            System.out.println("Invalid input. Please enter a number between 2 and 100.");
            System.exit(0);
        }
        int bin = 0, place = 1;

        while (n > 0) {
            int r = n % 2;
            bin = bin + r * place;
            place *= 10;
            n /= 2;
        }
        System.out.println("Binary: " + bin);
        String binStr = Integer.toString(bin);
        int c = 0;
        for(int i=0;i<binStr.length();i++){
            if(binStr.charAt(i)=='1'){
                c++;
            }
        }
        if(c%2==0){
            System.out.println("The number is evil.");
        }
        else{
            System.out.println("The number is not evil.");
        }
    }
}