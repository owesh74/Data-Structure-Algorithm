public class QueueLL {
    public static class Node {
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
    static Node Head = null;
    static Node Tail = null;
   

        public static boolean isEmpty(){
            return Head == null && Tail == null;
        }

        public static void add(int data){
            Node Tnode = new Node(data);

            if (isEmpty()) {
                Head = Tail = Tnode;
                return;
            }
            Tail.next = Tnode;
            Tail = Tnode;
        }

        public static int Remove(){
            if (isEmpty()) {
                System.out.println("Nothing to Remove");
                return -1;
            }
            int top = Head.data;
            if (Head == Tail) {
                Head = Tail = null;
            }else{
                Head = Head.next;
            }
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Nothing to print");
                return -1;
            }

            return Head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(0);
        q.add(9);
        q.add(4);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.Remove();
        }
    }
}
