import java.util.*;
public class arrayIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter your numbers:");

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the value of which you want to find the index value:");
        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("X found at index: "+i);
            }
        }

        sc.close();
    }
}