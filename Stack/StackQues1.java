import java.util.*;

public class StackQues1 {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int curr = s.pop();    
        pushAtBottom(s, data);
        s.push(curr);


    }

    public static void revStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revStack(s);
        pushAtBottom(s, top);

    }

    public static void stackRex(Stack<Character> s, String st){
      int i = 0;
        while (i < st.length()) {
            s.push(st.charAt(i));
            
            i++;
        }
      StringBuilder str = new StringBuilder();  

        while (!s.isEmpty()) {
            str.append(s.peek());
            s.pop();
        }
        st = str.toString();
        System.out.println(st);

    }
    public static void printStack(Stack<Integer> s){
         while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();    
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        revStack(s);
        printStack(s); 
    //     Stack<Character> sa = new Stack<>();
    //  stackRex(sa, "abc");
    int a = 6;
    int b = -1;
    System.out.println(a-b);
    }
}
