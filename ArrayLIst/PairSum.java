import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int key = 5;
        for (int i = 0; i < List.size(); i++) {
            for (int j = 0+1; j < List.size(); j++) {
                if(List.get(i) + List.get(j) == key){
                    System.out.println("Founded : " + i + " " + j);
                    return;
                }                
            }
        }
    }
}