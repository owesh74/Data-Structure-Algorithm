public class RevArray {

    public static void Reverse(int arr[]){
        int str = 0;
        int end = arr.length-1;

        while(str < end){

            int Temp = arr[end];
            arr[end] = arr[str];
            arr[str] = Temp;
            
            str++;
            end--;

        }

    }
    public static void main(String[] args) {
    int arr[] = {1,3,5,7,9};
        Reverse(arr);
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}