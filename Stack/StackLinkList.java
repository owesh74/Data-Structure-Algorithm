public class StackLinkList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node tNode = new Node(data);
            if (isEmpty()) {
                head = tNode;
                return; 
            }
            tNode.next = head;
            head = tNode;
        }

        public static int pop(){
            if (isEmpty()) {
                return -1; 
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            int val = head.data;
            return val;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(8);
        s.push(6);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();    
        }
    }
}

