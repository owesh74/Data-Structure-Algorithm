import java.util.ArrayList;
public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> List = new ArrayList<>();

        public static boolean isEmpty(){
            return List.size() == 0;
        }

        public static void push(int data){
            List.add(data);
        }

        public static int pop(){
            int top = List.get(List.size() -1);
            List.remove(List.size()-1);
            return top;
        }

        public static int peek(){
            return List.get(List.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(5);
        s.push(8);
        s.push(4);

        while (!s.isEmpty()) {
           System.out.println(s.peek());
           s.pop();

        }
    }
}