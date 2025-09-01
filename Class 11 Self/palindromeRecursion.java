public class palindromeRecursion {
    public static boolean isPal(int n, int f, int l){
        String num = Integer.toString(n);
        if(f>=l){
            return true;
        }else if(num.charAt(f) != num.charAt(l)){
            return false;
        }
        else{
            return isPal(n, f+1, l-1);
        }
    }
    public static void main(String[] args) {
        if(isPal(12321, 0, 4)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
