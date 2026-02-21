public class AssignmentQutions {
    public static void Printarr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(String arr[] , int si, int ei){
        if (si >= ei) {
            return;
        }

        int mid = si + (ei-si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[] , int si , int mid , int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<= mid) {
            temp[k++] = arr[i++];
        }

        
        while (j <= ei) {
            temp[k++] = arr[j++];
        }


        for (k = 0 , i = si; k <= temp.length-1; k++ , i++) {
            arr[i] = temp[k];
        }
    }
        
    // public static int DuplicateNum(int nums[]) {
        

       
    // }
    public static void StoreFrek(int nums[] , int si , int ei) {
        if(si >= ei){
            return;
        }
        
        int Count[] = new int[nums.length];
        if(nums[si] > 0){
            Count[nums[si]]++;
        }
        StoreFrek(nums , 0+1 , ei);
        
    }
    public static void main(String[] args) {
        
        String arr[] = {"Apple" , "banana" , "Orange" , "Mango" , "Grapes"};
        int arrI[] = {7,7,7,8,8,8};
        mergeSort(arr, 0, arr.length-1);
        // Printarr(arr);
        StoreFrek(arrI, 0, 8);
        Printarr(arrI);

    }
}
