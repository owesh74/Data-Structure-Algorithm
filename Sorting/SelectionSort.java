import java.util.*;

public class SelectionSort {

    public static void SelSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int Min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[Min] > arr[j]) {
                    Min = j;
                }
            }
            int t = arr[Min];
            arr[Min] = arr[i];
            arr[i] = t;
        }

    }


    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 8, 3, 2, 1 };
        SelSort(arr);
        Printarr(arr);

    }

}
