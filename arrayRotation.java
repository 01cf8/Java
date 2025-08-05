import java.util.Scanner;

public class arrayRotation {
    int[] arr;
    arrayRotation(){
        arr = new int[5];
    }
    void input(Scanner sc){
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }
    void rotate(int n){
        n = n % arr.length;
        if(n == 0) return;
        
        reverse(0, arr.length - 1);
        reverse(0, n - 1);
        reverse(n, arr.length - 1);
    }
    
    void reverse(int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    void print(){
        System.out.println("Right rotated array:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        arrayRotation obj = new arrayRotation();
        try(Scanner sc = new Scanner(System.in)){
            obj.input(sc);
            System.out.println("Enter the number of rotations");
            int n = sc.nextInt();
            obj.rotate(n);
            obj.print();
        }
    }
}