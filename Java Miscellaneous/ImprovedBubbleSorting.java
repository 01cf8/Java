import java.util.*;
public class ImprovedBubbleSorting {
    public static void main(String []args) {
      int size, i, j, temp;
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter the number of integers to sort:");
      size = sc.nextInt();
   
      int arr[] = new int[size];
   
      System.out.println("Enter " + size + " integers: ");
   
      for (i = 0; i < size; i++) 
        arr[i] = sc.nextInt();
   
      for (i=0; i<size-1; i++) {
        for (j=0; j<size-i-1; j++) {
          if (arr[j] < arr[j+1])  //Change the < sign to > to make it sort in accending order.
          {
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
   
      System.out.println("Sorted integers are:");
   
      for (i = 0; i < size; i++) 
        System.out.println(arr[i]);
    } 
  }