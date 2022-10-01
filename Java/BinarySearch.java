import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    static int binarySearch(int arr[],int start,int end,int num){
        if(end>=start){
            // To locate the middle point of the array
            int mid = start+(end-1)/2;

            // If the element is present at the middle itself
            if(arr[mid]==num)
            {
                return mid;
            }

            // If the element is present in the left half of the array
            if(arr[mid]>num)
            {
                return binarySearch(arr, start, mid-1, num);
            }

            // The only case left is the element being in right half
            return binarySearch(arr, mid+1, end, num);
        }

        // If the element is not present in array
        return -1;
    }

  public static void main(String[] args) 
  {
    // using the system input method 
    Scanner scan = new Scanner(System.in);

    // taking the input for the length of the array
    System.out.println("Enter the length of the array");
    int length = scan.nextInt();

    //declaration of an integer array 
    int arr[]  = new int[length];

    System.out.println("Input" + "lenght" + "number of array elements");
    //array element input
    for(int i=0;i<length;i++){
        arr[i] = scan.nextInt();
    }

    //sorting the array in ascending order using the method from Arrays class
    Arrays.sort(arr);
    
    System.out.println("Input the number to be found");
    //the number to be found
    int number = scan.nextInt();

    //calling the function for binary search
    int result = binarySearch(arr, 0, length-1, number);

    if(result == -1)
      {
        System.out.println("Element not available");
      }
    else
      {
        System.out.println("Element found at index: " + result+1);
      }

  }  
}