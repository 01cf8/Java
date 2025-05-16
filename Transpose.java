import java.util.*;
public class Transpose {
    int[][] a;
    Transpose(){
        a = new int[4][3];
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    int[][] transpose(int[][] A){
        int r = A.length;
        int c = A[0].length;
        int[][] B = new int[c][r];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j ++){
                B[j][i] = A[i][j];
            }
        }

        return B;
    }
    void print(int[][] A){
        System.out.println("Transposed matrix:");
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Transpose obj = new Transpose();
        obj.input();
        obj.print(obj.transpose(obj.a));
    }
}
