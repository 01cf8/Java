public class fibonacciSeries {

    static int[] memo;

    static int fibonacci(int n) {
        if (memo[n] != -1)
            return memo[n];

        if (n == 0)
            memo[n] = 0;
        else if (n == 1)
            memo[n] = 1;
        else
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2);

        return memo[n];
    }

    public static void main(String[] args) {
        int terms = 20;
        memo = new int[terms + 1];

        for (int i = 0; i <= terms; i++) {
            memo[i] = -1;
        }

        System.out.println("Fibonacci series up to " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
