import java.util.*;
public class FirstNonRepeatingChar {
    public static void isRepeating(String str){
            int Frequency[] = new int[26];
            Queue<Character> q = new LinkedList<>();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                q.add(ch);
                Frequency[ch - 'a']++;
                while (!q.isEmpty() && Frequency[q.peek() - 'a'] > 1) {
                    q.remove();
                }
                if (q.isEmpty()) {
                    System.out.println(-1);
                }else{
                    System.err.println(q.peek());
                }
            }

        }
    public static void main(String[] args){
        String str = "aabccxb";
        isRepeating(str);
        char a = 'b';
        System.out.println((int)a);
    }
    
}
