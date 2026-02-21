import java.util.*;
public class MyArrayList {
    public static void swap(ArrayList<Integer> list, int inx1 , int inx2){
        
        int Temp = list.get(inx1);
        list.set(inx1, list.get(inx2));
        list.set(inx2, Temp);
        inx2 = Temp;
 
    }

    public static void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    swap(list, i, j);
                }
            }
        }
 
    }

    public static void Largest(ArrayList<Integer> list){
        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > Max) {
                Max = list.get(i);
            }
        }
        System.out.println(Max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(5);


        System.out.println(list);

        // swap(list, 0, 3);
        // sort(list);
        // Collections.sort(list);
        // Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);

      
    }
}