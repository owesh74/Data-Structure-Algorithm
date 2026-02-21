import java.util.*;


public class LinkedLists{
    static int size;
    public static class Node{
        int data;
        Node nxt;

        public Node(int data) {
            this.data = data;
            this.nxt = null;
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
        size++;

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
        size++;

    }

 
    public void addinMid(int data, int idx){
        Node tempNode = Head;
        for (int i = 0; i < idx-1; i++) {
            tempNode = tempNode.nxt;
        }
       
        Node newNode = new Node(data);
        newNode.nxt =  tempNode.nxt;
        tempNode.nxt = newNode;
        size++;
    }    

    
    public void reminFirst(){
        
        if (size == 0) {
                System.out.println("LL Is Empty");
                return;
        }else if(size == 1){
            Head = Tail = null;
        }
        Head = Head.nxt;

        size--;

    }


    
    public void reminLast(){
   
    if (size == 0) {
            System.out.println("LL Is Empty");
            return;
    }else if(size == 1){
        Head = Tail = null;
    }
    Node TempTail = Head;

    for (int i = 0; i < size-1; i++) {
         TempTail = TempTail.nxt;
    }
    
    TempTail.nxt = null;
    Tail = TempTail;

    size--;
    }

    public void Print(){
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


    public static int search(int key){
        Node Tempnode = Head;
        int counter = 1;
        while (Tempnode != null) {
            if (Tempnode.data == key) {
                return counter;
            }
            counter++;
            Tempnode = Tempnode.nxt;
        }

        return -1;
    }

    public static int recSearch(Node Tempnode, int i, int key){
        if (Tempnode.data == key) {
            return i;
        }
        if (Tempnode.nxt == null) {
            return -1;
        }
        

        return recSearch(Tempnode.nxt , i+1, key);
    }

    public void revLL(){
        Node prev = null;
        Node curr = Head;
        Node next;
        
        while (curr != null) {
            next = curr.nxt;
            curr.nxt = prev;
            prev = curr;
            curr = next;
        }
        Head = prev;
    }

    public void remnth(int n){
        n = size - n + 1;
        Node newNode = Head;
        for (int i = 0; i < n-1; i++) {
            newNode = newNode.nxt;
        }
        Object foo = new Object();
        
    }
    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();
        ll.addinFirst(1);
        ll.addinLast(2);
        ll.addinMid(8, 1);
        ll.addinMid(3,  2);
        ll.addinLast(7);
        ll.addinLast(6);
        // ll.reminFirst();
        // ll.reminLast();
        ll.Print();
        ll.remnth(2);
        
        ll.Print();
        System.out.println(size);
        int sizee = 9;
        System.out.println(sizee);
        System.out.println(recSearch(Head , 1 , 3));
        ll.revLL();
        ll.Print();


        
    }



    public void MergeSort(MergeSortLL.Node head2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'MergeSort'");
    }
}