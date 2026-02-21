public class Badmoshi {

    public static boolean isSafe(char Board[][] , int row , int col){
        for (int i =row-1; i >=0; i--) {
            if(Board[i][col] == 'Q'){
                return false;
            }            
        }

        for (int i=row-1 ,j = col-1; i >=0 && j >=0 ; i-- , j--) {
                if (Board[i][j] == 'Q') {
                    return false;
                }
        }


        for (int i=row-1 ,j = col+1; i >=0 && j < Board.length ; i-- , j++) {
            if (Board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    
    }
    public static void printarr(char arr[][]) {
        System.out.println("==========New Array==========");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void nQueens(char Board[][],int row){
            if (row == Board.length) {
                printarr(Board);
                return;
            }
            for (int i = 0; i < Board.length; i++) {
                if (isSafe(Board, row, i)) {
                    Board[row][i] = 'Q';
                    nQueens(Board, row+1);
                    Board[row][i] = '.';

                }
            }
    }
    public static void main(String[] args) {
        int n = 5;
        char arr[][] = new char[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = '.';
            }
        }
        nQueens(arr, 0);
    }
}
