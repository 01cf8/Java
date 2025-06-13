import java.util.Scanner;

public class arrayRotation {
    int[] arr;
    arrayRotation(){
        arr = new int[5];
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    int[] rotate(int n){

    }
}
