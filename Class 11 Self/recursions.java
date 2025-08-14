public class recursions {
    public static int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        factorial(5);
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}