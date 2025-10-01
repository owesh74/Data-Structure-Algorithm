import java.util.*;
public class GreatesSmallesttInArray {
    
    public static int LargestInArray(int arr[]){
        int LgNum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
          if(arr[i] > LgNum){
            LgNum = arr[i];
          }
        }
        return LgNum;
      }

      public static int SmallestInArray(int arr[]){
        int SmNum = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
          if(arr[i] < SmNum){
            SmNum = arr[i];
          }
        }
        return SmNum;
      }
    
        
    public static void main(String args[]){
      
        int arr[] = {100,4,2,7,14,9,3,6,55};
        System.out.println("Largest Number is " + LargestInArray(arr));
        System.out.println("Smallest Number is " + SmallestInArray(arr));
    }

}
