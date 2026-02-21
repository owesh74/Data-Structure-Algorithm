
import java.util.*;
public class WaterOptimize {

    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
            List1.add(1);
            List1.add(8);
            List1.add(6);
            List1.add(2);
            List1.add(5);
            List1.add(4);
            List1.add(8);
            List1.add(3);
            List1.add(7);
            int Width;
            int Water;
            int Max = Integer.MIN_VALUE;
            
        System.err.println(List1);
        int Lptr = 0;
        int Rptr = List1.size()-1;
        while (Lptr < Rptr) {
            int Height = Math.min(List1.get(Lptr), List1.get(Rptr));
            Width = Rptr - Lptr;
            Water = Height * Width;
            Max = Math.max(Max, Water); 
            if (Lptr < Rptr) {
                Lptr++;
            }else{
                Rptr--;
            }
        }
      
        System.out.println(Max);
    }   
}
