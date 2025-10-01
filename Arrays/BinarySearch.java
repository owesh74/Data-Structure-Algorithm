public class BinarySearch {
    
    public static int BinrySrh(int arr[] , int n){
int str = 0;
int end = arr.length-1;

while(str <= end){
int mid = (str + end) / 2;
    

        if(arr[mid] == n){
            return mid;
        }
        if(arr[mid] < n){
     
            str = mid+1;
        }
        else{
        
            end = mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7};
        int n = 4;
        if(BinrySrh(arr, n) == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println(n + " is at " + BinrySrh(arr, n) + " Index");
        }

    }
}
