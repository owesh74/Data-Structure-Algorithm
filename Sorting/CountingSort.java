import java.util.*;
public class CountingSort {
    
   public static void CountSort(int arr[]){
    int Max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        Max = Math.max(Max , arr[i]);
    }
    
    int Count[] = new int[Max+1];

    for (int i = 0; i < arr.length; i++) {
        Count[arr[i]]++;
    }

    int Index = arr.length - 1;
    for (int i = Count.length - 1; i >= 0; i--) {
        while (Count[i] > 0) {
            arr[Index] = i;
            Index--;
            Count[i]--;
        }
    }
}





public static void Printarr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        int arr[] = {1,4,5,6,2,3};
        CountSort(arr);
        Printarr(arr);
    }
}
