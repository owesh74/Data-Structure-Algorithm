public class SearchInMatrix {
    public static void Search(int arr[][], int key){
        int Row = arr.length-1;
        int Col = 0;

        while( Col < arr[0].length && Row >= 0){
        if(arr[Row][Col] == key){
            System.out.println("Found At : " + Row + "," + Col );
            return;
        }
        else if(key < arr[Row][Col]){
            Row--;
        }
        else{
            Col++;
        }
        
        }
        System.out.println("Key Not Found");
    }
    public static void main(String[] args) {
        int arr[][] = {
        {10,20,30,40},
        {15,25,35,45},
        {27,29,37,39},
        {32,33,39,50},
        };
        Search(arr, 50);
    }
}
