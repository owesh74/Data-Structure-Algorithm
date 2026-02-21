public class QuesSet {

    static int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public void addinFirst(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
        size++;

    }

    public void addinLast(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
        newNode.next = null;
        size++;

    }

    public void addinMid(int data, int idx) {
        Node tempNode = Head;
        for (int i = 0; i < idx - 1; i++) {
            tempNode = tempNode.next;
        }

        Node newNode = new Node(data);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
        size++;
    }

    public void reminFirst() {

        if (size == 0) {
            System.out.println("LL Is Empty");
            return;
        } else if (size == 1) {
            Head = Tail = null;
        }
        Head = Head.next;

        size--;

    }

    public void reminLast() {

        if (size == 0) {
            System.out.println("LL Is Empty");
            return;
        } else if (size == 1) {
            Head = Tail = null;
        }
        Node TempTail = Head;

        for (int i = 0; i < size - 1; i++) {
            TempTail = TempTail.next;
        }

        TempTail.next = null;
        Tail = TempTail;

        size--;
    }

    public void Print() {
        if (Head == null) {
            System.err.println("Linked List Is Empty");
            return;
        }
        Node newNode = Head;
        while (newNode != null) {
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
        System.out.println("Null");
    }

    public void linkdelete(Node head, int n, int m) {
 
        Node TempNode = head;
        while (TempNode != null) {
            for (int i = 0; i < m-1 && TempNode != null; i++) {
                    TempNode = TempNode.next;
                    System.out.println(1);
            }
            if (TempNode == null) return;

            Node temp = TempNode.next;
            for (int i = 0; i < n && temp != null; i++) {
                   temp = temp.next;
            }
            TempNode.next = temp;

            TempNode = temp;
        }
    }

    public void SwappingNodes(Node head, int n, int m){
        Node Temp = Head;
        Node N = null;
        Node M = null;
        while (Temp != null) {
            if (Temp.data == n) {
                 N = Temp;
            }
            if (Temp.data == m) {
                M = Temp;
            }
            Temp = Temp.next;
        }
            Node Tem = N;
            N = M;
            M = Tem;
            
       


    }

    public static void main(String[] args) {
        QuesSet ll = new QuesSet();
        ll.addinFirst(1);
        ll.addinLast(2);
        ll.addinLast(3);
        ll.addinLast(4);
        ll.addinLast(5);
        ll.addinLast(6);
        ll.addinLast(7);
        ll.addinLast(8);
        ll.addinLast(9);

        ll.Print();

        ll.SwappingNodes(Head, 2, 7);
        ll.Print();

    }

}
