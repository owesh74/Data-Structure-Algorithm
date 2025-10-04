public class SpiralMatrix {
    public static void SpiralMatrixx(int arr[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = arr.length-1;
        int EndCol = arr[0].length-1;


        while(StartCol <= EndCol && StartRow <= EndRow){
            //right
        for (int i = StartCol; i <= EndCol; i++) {
            System.out.print(arr[StartRow][i] + " ");
        }    
        //left
        for (int i = StartRow+1; i <= EndRow; i++) {
            System.out.print(arr[i][EndCol] + " ");
        }
        //Bottom
        for (int i = EndCol-1; i >= StartCol; i--) {
            // if(StartRow == EndRow){
            //     break;
            // }
            System.out.print(arr[EndRow][i] + " ");
        }
        //Left
        for (int i = EndRow-1; i >= StartRow+1; i--) {
            // if(StartCol == EndCol){
            //     break;
            // }
            System.out.print(arr[i][StartCol] + " ");
        }

        StartCol++;
        EndCol--;
        StartRow++;
        EndRow--;
    }
    }


    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        SpiralMatrixx(arr);


    }
}
