import java.util.*;
public class Simplify {
    
    public static void simplifyPath(String str){
        Stack<String> s = new Stack<>();
        String Fans = "/";
        for (int i = 0; i < str.length(); i++) {
           
        }
   while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }        
    }
    public static void main(String[] args) {
        String str = "/abc/a/..";
        simplifyPath(str);
     
    }
}
