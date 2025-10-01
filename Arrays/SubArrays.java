import java.util.*;
// public class SubArrays {

//     public static void SubArrayPairs(int arr[]){
// for (int i = 0; i < arr.length; i++) {

//    for (int j = i; j < arr.length; j++) {

//     for (int k = i;  k <=j; k++) {
//         System.out.print(arr[k] + " ") ;

// }
//     System.out.print(" ");
// } 
// System.out.println();

// }

//     }
//     public static void main(String[] args) {
//     int arr[] = {2,4,6,8,10};
// SubArrayPairs(arr);
//     }
// }











// Sum Of sub pairs brute Force
// public class SubArrays {

//     public static void SubArrayPairs(int arr[]) {
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                     for (int k = i; k <= j; k++) {
//                     sum += arr[k];
//                 }
//                 if (sum < min) {
//                     min = sum;
//                 }
//                 if (sum > max) {
//                     max = sum;
//                 }
//                 System.out.print(sum + " ");

//             }
//             System.out.println();

//         }
//         System.out.println("MInimum Sum is : " + min + " ,  Maximum sum is : " + max);

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, -2, 6, -1, 3};
//         SubArrayPairs(arr);
//     }
// }








// Prefix Sum
// public class SubArrays {

//     public static void SubArrayPairs(int arr[]) {
//         int max = Integer.MIN_VALUE;
//         int Prefix[] = new int[arr.length];

//         Prefix[0] = arr[0];
//         for (int i = 1; i < Prefix.length; i++) {
//             Prefix[i] = Prefix[i-1] + arr[i];
//         }
        
//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i; j < arr.length; j++) {
//                 int sum = i == 0? Prefix[j] : Prefix[j] - Prefix[i-1];
//                 if (sum > max) {
//                     max = sum;
//                 }
//                 System.out.println(sum + " ");
//             }
//         }
//         System.out.println("Maximum sum is : " + max);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, -2, 6, -1, 3};
//         SubArrayPairs(arr);
//     }
// }






//Kadane's Algo

public class SubArrays {

    public static void Kadane(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        
//extra h.w part
        boolean Negitive = true;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] > 0){
                Negitive = false;
            }
         }
        //---
        
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            System.out.println(currSum);
     
        if(Negitive == false){
            if(currSum < 0 ){
                currSum = 0;
            }
        }
        max = Math.max(currSum , max);
         
        }
        System.out.println("Maximum sum is : " + max);

    }

    public static void main(String[] args) {
        int arr[] = { 4 , -1, -2, -3 , 4};
        // SubArrayPairs(arr);
        Kadane(arr);
    }
}