public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node Head;
    public static Node Tail;
    public static int Size;

    public void addinFirst(int data) {
        Node newNode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;

    }

     public void addinLast(int data) {
        Node newNode = new Node(data);
        Size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.prev = Tail;
        Tail.next = newNode;
        Tail = newNode;

    }
    
    public void ReminLast() {
        if (Head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Size--;
        if (Size == 1) {
            Tail = Head = null;
            return;
        }
        Tail = Tail.prev;
        Tail.next = null;
        

    }

    public void ReminFirst() {
        if (Head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Size--;
        if (Size == 1) {
            Head = Tail = null ;
            return;
        }
        Head = Head.next;
        Head.prev = null;
     
        

    }
    public void Print() {
        Node newNode = Head;
    
        while (newNode != null) {
            System.out.print(newNode.data + "<->");
            newNode = newNode.next;
        }
        System.out.println("Null");
    }

     public static void revLinkList() {
        Node Prev = null;
        Node Curr = Tail = Head;
        
        while (Curr != null) {
            Node Next = Curr.next;
            Curr.next = Prev;
            Curr.prev = Next;
            Prev = Curr;
            Curr = Next;

        }
        Head = Prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList Dll = new DoublyLinkedList();
        Dll.addinFirst(3);
        Dll.addinFirst(8);
        Dll.addinFirst(4);
        Dll.addinFirst(9);

        Dll.addinLast(98);
        Dll.Print();
        Dll.revLinkList();
        Dll.Print();



    }
}
