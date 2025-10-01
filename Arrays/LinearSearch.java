public class LinearSearch {

    public static int LinearSort(int arr[] , int n){
        for(int i = 0 ; i<arr.length;i++){
          if(arr[i] == n){
             return i;
          }
        }
        return -1;
      }
  
      public static void main(String[] args) {
    
    int arr[] = {100,4,2,7,14,9,3,6,55,0};
    int key = 55;

    if (LinearSort(arr,key) == -1){
      System.out.println(" no Value Found ");
    } 
    else{
      System.out.println(key + " is on " + LinearSort(arr,key) + " Index");

    }

      }
}

