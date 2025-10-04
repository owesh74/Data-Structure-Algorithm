public class DigonalSumInMatrix {
    public static void DigSum(int arr[][]){
        int Sum = 0;

        //Hight Time Complexcity O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if(i == j ){
        //          Sum+= arr[i][j];
        //         }
        //         else if( i+j == arr.length-1 ){
        //          Sum+= arr[i][j];
        //         }
                
        //     }
        // }

//Linear Time Complexcity
        for (int i = 0; i < arr.length; i++) {
            Sum+= arr[i][i];

            if(i != arr.length-1-i){
                Sum+= arr[i][arr.length-1-i];
            }
        }
        System.out.println(Sum);
    }
    public static void main(String[] args) {
                int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        DigSum(arr);
    }
}
