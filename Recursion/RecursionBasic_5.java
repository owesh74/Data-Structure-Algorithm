public class RecursionBasic_5 {

    public static Boolean Sorted(int arr[] , int i){
        if (i == arr.length-1) {
            return true;            
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return Sorted(arr , i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(Sorted(arr , 0));
    }
} 