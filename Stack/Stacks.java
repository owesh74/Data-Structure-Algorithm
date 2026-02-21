import java.util.ArrayList;
public class Stacks {
    static class InnerStack {
       static ArrayList<Integer> List = new ArrayList<>();
        
       public static boolean isEmpty(){
        return List.size() == 0;
       }

       public static void push(int data){
        List.add(data);
       }

       public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = List.size()-1;
        List.remove(List.size()-1);
        return top;
    }

       public static int peek(){
         if(isEmpty()){
            return -1;
        }
        return List.get(List.size()-1);
       }
    }


    public static void main(String[] args) {
        InnerStack S = new InnerStack();
        S.push(4);
        S.push(2);
        S.push(6);
        S.push(5);

       while (!S.isEmpty()) {
        System.out.println(S.peek());
        S.pop();
       }
    }
}
