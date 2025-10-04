import java.util.*;
public class LargestAndSmallestInArray {
    public static void Input(int arr[][]){
        Scanner S = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               arr[i][j] = S.nextInt(); 
            }
        }
    }


    public static void Output(int arr[][]){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void LargestAndSmallest(int arr[][]){
     int Max = Integer.MIN_VALUE;
     int Min = Integer.MAX_VALUE;
     int MaxI = 0;
     int MaxJ = 0;
     int MinI = 0;
     int MinJ = 0;
     
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if(arr[i][j] > Max){
                Max = arr[i][j];
                MaxI = i;
                MaxJ = j;
               }
               if(arr[i][j] < Min){
                Min = arr[i][j];
                MinI = i;
                MinJ = j;
               }
            }
        }
    System.out.println("Maximum is : " + Max + " At Index : " + MaxI + "," + MaxJ );    
    System.out.println("Minimum is : " + Min + " At Index : " + MinI + "," + MinJ );    
    }

    public static void main(String[] args) {
        int Arr[][] = new int[3][3];
        Input(Arr);
        Output(Arr);
        LargestAndSmallest(Arr);

    }

}