public class Assignment_1 {

//     Question 1 : Print the number of 7's that are in the 2d array.
// Example :
// Input : intl array = { {4,7,8},{8,8,7} };
// Output : 2


    public static void P1(int arr[][], int key) {
        int Count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    Count++;
                }
            }
        }
        System.out.println(Count);
    }



//     Question 2 : Print out the sum of the numbers in the second row of the "nums" array.
// Example :
// Input : intl nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output : 18

    public static void P2(int arr[][]) {
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[1][i];
        }
        System.out.println(Sum);
    }




    //Transpose the Matrix
    public static void P3(int arr[][]) {
        int Row = 0;
        int Col = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 + i; j < arr.length; j++) {
                int t = arr[Col][j];
                arr[Col][j] = arr[j][Row];
                arr[j][Row] = t;

            }
            Row++;
            Col++;
        }
   
    }


    //Aproach2
    public static void P33(int arr[][]) {
       int TransPose[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                TransPose[j][i] = arr[i][j];
            }
  
        }
        Printarr(TransPose);
        
    }



    public static void Printarr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 4, 7, 8 },
                { 8, 9, 7 },
                { 9, 0, 2 }
        };
        // P1(arr , 7);
        // P2(arr);
        // P3(arr);
        P33(arr);

     
    }
}
