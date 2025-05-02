public class recursions {
    public static int factorial(int n){
        if(n >= 1){
            return (n * factorial(n-1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        long f = factorial(5);
        System.out.println("The factorial is: "+f);
    }
}
