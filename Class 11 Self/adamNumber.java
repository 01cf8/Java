import java.util.Scanner;
public class adamNumber {
    public static boolean checkPrime(int n){
        int c = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==1) return true;
        else return false;
    }
    public static boolean checkAdam(int n) {
        int sq = n*n;
        int r = 0;
        while(n>0){
            int d = n%10;
            r = r*10 + d;
            n /= 10;
        }
        int rsq = r*r;
        int sqRev = 0;
        while(sq>0){
            int d = sq%10;
            sqRev = sqRev*10 + d;
            sq /= 10;
        }
        if(sqRev == rsq){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>n){
            System.out.println("Please enter valid range");
            System.exit(0);
        }
        int c = 0;
        System.out.println("AdamPrime no's are:");
        for(int i = m; i <= n; i++){
            if(checkAdam(i) == true && checkPrime(i) == true){
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println("\nFrequency of AdamPrime no's is: "+c);
    }
}