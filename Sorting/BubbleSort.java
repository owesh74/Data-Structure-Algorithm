
public class BubbleSort {
    public static void BubbleSort(int arr[]){
   for (int i = 0; i < arr.length-1; i++) {
    int Swap = 0;

    for (int j = 0; j < arr.length-1-i; j++) {
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;

            Swap ++;
        }
    }
    if(Swap == 0){
        System.out.println("Already Sorted");
        break;
}
  
}
    
}

public static void Printarr(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
}

    public static void main(String[] args) {

int arr[] = {2, 0, 2, 1, 1, 0};
        BubbleSort(arr);
        Printarr(arr);
    
    }
}
