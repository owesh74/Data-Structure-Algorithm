import java.util.*;

public class BohotDinoBaadLL {

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

    public static int searchinLL(int val) {
        Node TempNode = Head;
        int count = 1;

        while (TempNode != null) {
            if (TempNode.data == val) {
                return count;
            }
            TempNode = TempNode.next;
            count++;
        }
        return -1;
    }

    public static int recSearch(int key, Node TempNode, int counter) {
        if (TempNode == null) {
            return -1;
        }
        if (TempNode.data == key) {
            return counter;
        }
        return recSearch(key, TempNode.next, counter + 1);

    }

    public static void revLinkList() {
        Node Prev = null;
        Node Curr = Tail = Head;
        
        while (Curr != null) {
            Node Next = Curr.next;
            Curr.next = Prev;
            Prev = Curr;
            Curr = Next;

        }
        Head = Prev;
    }

    public static void remfromlast(int idx){
        if (idx == Size) {
            Head = Head.next;
            Size--;
            return;
        }
        int cidx = Size-idx+1;
        Node TempNode = Head;
        for (int i = 0; i < cidx-2; i++) {
            TempNode = TempNode.next;
        }
        TempNode.next = TempNode.next.next;
        Size--;
    }

    public static Node Findmid(Node Head){
        Node Slow = Head;
        Node Fast = Head;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        return Slow;
    }

    public static Boolean checkPalindrome(){
        if (Head == null || Head.next == null) {
            return true;
        }
        Node MidNode = Findmid(Head);

        Node prev = null;
        Node curr = MidNode;
        Node Next;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        Node Right = prev;
        Node Left = Head;

        while (Right !=null) {
            if (Left.data != Right.data) {
                return false;
            }

            Left = Left.next;
            Right = Right.next;
        }
        return true;

    }

    // public static int recSearchaerr(int key ,int arr[],int idx){
    // if(idx == arr.length) {
    // return -1;
    // }else if (arr[idx] == key) {
    // return idx;
    // }
    // return recSearchaerr(key, arr, idx+1);
    // }

    public static void PrintLL() {
        if (Size == 0) {
            System.out.println("Linked List is Emnpty");
            return;
        }
        Node Tempnode = Head;
        for (int i = 0; i < Size; i++) {
            System.err.print(Tempnode.data + "-> ");
            Tempnode = Tempnode.next;
        }
            System.out.print("Null");

    }

    public static void main(String[] args) {
        Addinf(1);
        Addinf(1);
        Addinf(3);
        AddinL(3);
        Addinm(3, 2);

        PrintLL();

        System.out.println();
        // remfromlast(5);

        System.out.println();
        PrintLL();
        System.out.println(checkPalindrome());
    } 
}