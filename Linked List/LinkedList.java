import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node nxt;

        public Node(int data) {
            this.data = data;
            this.nxt = null;
            System.out.println(data);
        }
    }
    public static Node Head;
    public static Node Tail;

    public void addinFirst(int data){
        Node newNode = new Node(data);
        if (Head == null) {
                Head = Tail = newNode;
                return;
        }
        newNode.nxt = Head;
        Head = newNode;

    }

    public void addinLast(int data){
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
    }
        Tail.nxt = newNode;
        Tail = newNode;
        newNode.nxt = null;

    }
    


    public static void PrintLinkedList(){
        if (Head == null) {
            System.err.println("Linked List Is Empty");
            return;
        }
        Node newNode = Head;
        while(newNode != null) {
            System.out.print(newNode.data + "->");
            newNode = newNode.nxt;
        }
        System.out.println("Null");
    }


    public static void addinMid(int data, int idx){
        Node tempNode = Head;
        for (int i = 0; i < idx-1; i++) {
            tempNode = tempNode.nxt;
        }
       
        Node newNode = new Node(data);
        newNode.nxt =  tempNode.nxt;
        tempNode.nxt = newNode;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add in First");
            System.out.println("2.Add in Last");
            System.out.println("3.Add in MIddle");
            System.out.println("7.Print");
            System.out.println("8.Exit");

            System.out.print(": ");
            int val = s.nextInt();

            if (val == 1) {
                System.out.print("Enter Data : ");
                int data = s.nextInt();
                ll.addinFirst(data);
            }
            if (val == 2) {
                System.out.print("Enter Data : ");
                int data = s.nextInt();
                ll.addinLast(data);
            }
            if (val == 3) {
                System.out.print("Enter Data : ");
                int data = s.nextInt();
                System.out.print("Enter Index : ");
                int idx = s.nextInt();

                ll.addinMid(data , idx);
            }
            if (val == 7) {
                PrintLinkedList();
            }
            if (val == 8) {
                break;
            }
        }
    }
}