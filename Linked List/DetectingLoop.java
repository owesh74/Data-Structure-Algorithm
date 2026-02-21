public class DetectingLoop {
       public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static int Size = 0;
    public static Node Head;
    public static Node Tail;

    public static void Addinf(int data) {
        Node newNode = new Node(data);

        if (Head == null) {
            Head = Tail = newNode;
        }
        newNode.next = Head;
        Head = newNode;
        Size++;
    }

    public static void AddinL(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
        Size++;
    }

    public static void Addinm(int data, int idx) {
        Node TempNode = Head;
        for (int i = 0; i < idx - 1; i++) {
            TempNode = TempNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = TempNode.next;
        TempNode.next = newNode;
        Size++;
    }

    public static void ReminF() {
        if (Size == 0) {
            System.out.println("Linked List Is Empty");
            return;
        } else if (Size == 1) {
            Head = Tail = null;
            Size--;
            return;
        }
        Head = Head.next;
        Size--;
    }

    public static void ReminL() {
        if (Size == 0) {
            System.out.println("Linked List Is Empty");
            return;
        } else if (Size == 1) {
            Head = Tail = null;
            Size--;
            return;
        }

        Node Prev = Head;
        for (int i = 0; i < Size - 2; i++) {
            Prev = Prev.next;
        }

        Prev.next = null;
        Tail = Prev;

        Size--;
    }


    public static void PrintLL() {
        if (Size == 0) {
            System.out.println("Linked List is Emnpty");
            return;
        }
        Node Tempnode = Head;
        while (Tempnode != null) {
            System.out.print(Tempnode.data + "-> ");
            Tempnode = Tempnode.next;
        }
            System.out.print("Null");

    }

    public static Boolean isLooped(){
        Node Slow = Head;
        Node Fast = Head;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;

            if (Slow == Fast) {
                return true;
            }
        }

        return false;

    }
    public static void RemoveCycle(){
        Node Slow = Head;
        Node Fast = Head;

        Boolean isLooped = false;
        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;

            if (Slow == Fast) {
                isLooped = true;
                break;
            }
        }
        if (isLooped == false) {
            return;
        }

        Slow = Head;
        Node prev = null;
        while (Slow != Fast) {
            prev = Fast;
            Slow = Slow.next;
            Fast = Fast.next;
        }

        prev.next = null;
    }
    

    public static void main(String[] args) {
        Addinf(1);
        Addinf(1);
        Addinf(3);
        AddinL(3);
        Addinm(3, 2);
        Tail.next = Head.next.next;
       
        Tail.next = Head.next.next.next;
        System.out.println();
        System.out.println(isLooped());
        RemoveCycle();
        PrintLL();
        System.out.println();
        System.out.println(isLooped());
    }
}
