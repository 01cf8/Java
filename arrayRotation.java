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
    void rotate(int n){
        int p = 1;
        while(p <= n){
            int first = arr[0];
            for(int i = 0; i < arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
            p++;
        }
    }
    void print(){
        System.out.println("Rotated array:");
        //noinspection ForLoopReplaceableByForEach
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        arrayRotation obj = new arrayRotation();
        obj.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations");
        int n = sc.nextInt();
        obj.rotate(n);
        obj.print();
    }
}