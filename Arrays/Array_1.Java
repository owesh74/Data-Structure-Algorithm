import java.util.*;
public class Array_1{


    public static int LinearSort(int arr[] , int n){
      for(int i = 0 ; i<arr.length;i++){
        if(arr[i] == n){
           return i;
        }
      }
      return -1;
    }



    public static int LargestInArray(int arr[]){
      int LgNum = Integer.MIN_VALUE;
      for(int i = 0; i<arr.length; i++){
        if(arr[i] > LgNum){
          LgNum = arr[i];
        }
      }
      return LgNum;
    }
    
    public static void main(String args[]){
      
    int arr[] = {100,4,2,7,14,9,3,6,55,0};
    
  

    System.out.println("Largest Number is " + LargestInArray(arr) + " It is at " + LinearSort(arr,LargestInArray(arr)) + " Index");



    }
}