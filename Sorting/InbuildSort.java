import java.util.*;

public class InbuildSort {
    public static void Printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 4, 1, 6, 2, 3};
        Arrays.sort(arr, 0, 3);
        Printarr(arr);

        // Integer arr1[] = { 3, 4, 5, 9, 6, 7, 8, 2, 1 };
        // Arrays.sort(arr1, Collections.reverseOrder());
        // Printarr(arr1);
    }
}