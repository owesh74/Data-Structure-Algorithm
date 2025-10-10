import java.util.*;

public class BitOperation_2 {

    public static int GetithBit(int n, int i){
        return (n & (1<<i));
    } 

    public static int SetithBit(int n, int i){
        return (n | (1<<i));
    }

    public static int ClearithBit(int n, int i){
        return (n & ~(1<<i));
    }


    public static int UpdateithBit1(int n, int i , int update){
       if (update == 0) {
        return ClearithBit(n, i);
       }
        return SetithBit(n, i);
    }

    public static int UpdateithBit2(int n, int i , int update){
        n = ClearithBit(n, i);
        int Bitmask = update<<i;
        return n | Bitmask;
     }

     public static int ClearLastithBit(int n, int i){
        int Bitmask = -1 << i;
        return n & Bitmask;
    }
    public static int ClearRangeBit(int n, int i , int j){
        int a = -1 << (j+1);
        int b = (int)Math.pow(2, i) - 1;
        
        int Bitmask = a | b;
        return n & Bitmask;

    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Num = S.nextInt();

        // if (GetithBit(Num, 2) == 0){
        //     System.out.println(0);
        // }else{
        //     System.out.println(1);
        // }

        // System.out.println(SetithBit(Num, 2));

        // System.out.println(ClearithBit(Num, 2));

     int res = ClearRangeBit(Num, 2, 7);
       System.out.println(res);
    }
    
}  