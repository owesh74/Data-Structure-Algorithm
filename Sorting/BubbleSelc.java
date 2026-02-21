
public class BubbleSelc {
    public static void Sorting(int arr[]){
   for (int i = 0; i < arr.length-1; i++) {
    for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j] < arr [j+1]){
        int Temp = arr[j];
        arr[j] = arr [j+1];
        arr[j+1] = Temp;
        }
    }
   }
 }
 
 public static void SelSort(int arr[]){
        
    for (int i = 0; i < arr.length-1; i++) {
        int min = i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[min] < arr[j]){
                min = j;
            }

        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}

    public static void Printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {5,6,7,1,2,3,4,8,9};
        Sorting(arr);
        // SelSort(arr);
        Printarr(arr);
    }
}
