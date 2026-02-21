import java.util.*;
public class My2edArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            List1.add(i);
            List2.add(i*2);
            List3.add(i*3);
        }
        MainList.add(List1);
        MainList.add(List2);
        MainList.add(List3);

        for (int i = 0; i < MainList.size(); i++) {
            ArrayList<Integer> curr = MainList.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(MainList);
    }   
}
