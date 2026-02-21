import java.util.*;
public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
dq.addFirst(1);
dq.addLast(5);
System.out.println(dq);
dq.removeFirst();
System.out.println(dq);
dq.addFirst(1);
dq.removeLast();
System.out.println(dq);
dq.getFirst();
dq.getLast();
    }
}
