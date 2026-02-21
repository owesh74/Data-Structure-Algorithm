public class BasicBacktracking{
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static void Changearr(int arr[],int i,int val) {
        if(i == arr.length){
            printarr(arr);
            return;
        }

        arr[i] = val;
        Changearr(arr, i+1, val+1);
        arr[i] -= 2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Changearr(arr, 0, 1);
        printarr(arr);
    }
}