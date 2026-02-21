
import java.util.*;
public class Water {

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
        for (int i = 0; i < List1.size(); i++) {
            for (int j = i+1; j < List1.size(); j++) {
            int Height = Math.min(List1.get(i), List1.get(j));
            Width = j - i;
            Water = Height * Width;
            Max = Math.max(Max, Water);

            }
        }
        System.out.println(Max);
    }   
}
