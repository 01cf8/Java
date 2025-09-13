public class fibonacciSeries {
    public static int fibonacci(int n){
        if(n>1){
            return fibonacci(n-1) + fibonacci(n-2);
        }else if(n==1||n==0){
            return n;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for(int j = 1; j <= n; j++){
            System.out.print(fibonacci(j) + " ");
        }
        System.out.println();
    }
}