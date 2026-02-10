import java.util.Scanner; 
public class matrixFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();
        if(n<3||n>10){
            System.out.println("Invalid input. Please enter a number between 3 and 10.");
            System.exit(0);
        }
        char[][] M = new char[n][n];
        System.out.println("Enter 3 characters: ");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        char c3 = sc.next().charAt(0);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if((i==0 || i==n-1)&&(j==0 || j==n-1)){
                    M[i][j] = c1;
                }
                else if(i==0||i==n-1||j==0||j==n-1){
                    M[i][j] = c2;
                }
                else{
                    M[i][j] = c3;
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(M[i][j] + "\t");
            }
            System.out.println();
        }
    }
}