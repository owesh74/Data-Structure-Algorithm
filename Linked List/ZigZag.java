public class ZigZag {
    
    static int size;
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
        newNode.next = Head;
        Head = newNode;
        size++;

    }

    
    
    public void addinLast(int data){
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

 
    public void addinMid(int data, int idx){
        Node tempNode = Head;
        for (int i = 0; i < idx-1; i++) {
            tempNode = tempNode.next;
        }
       
        Node newNode = new Node(data);
        newNode.next =  tempNode.next;
        tempNode.next = newNode;
        size++;
    }    

    
    public void reminFirst(){
        
        if (size == 0) {
                System.out.println("LL Is Empty");
                return;
        }else if(size == 1){
            Head = Tail = null;
        }
        Head = Head.next;

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
         TempTail = TempTail.next;
    }
    
    TempTail.next = null;
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
            newNode = newNode.next;
        }
        System.out.println("Null");
    }

   
    public void zigZagLL() {

        Node Slow = Head;
        Node Fast = Head.next;

        while (Fast != null && Fast.next != null) {
            Slow = Slow.next;
            Fast = Fast.next.next;
        }   

        Node mid = Slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;

        Node Next;

        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;

        }

        Node Left = Head;
        Node Right = prev;

       Node nRight , nLeft;

       while (Left != null && Right != null) {
        nLeft = Left.next;
        nRight = Right.next;
        
        Left.next = Right;        
        Right.next = nLeft;

        Left = nLeft;
        Right = nRight;
       }

    }

    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addinFirst(2);
        ll.addinFirst(7);
        ll.addinFirst(9);
        ll.addinLast(98);
        ll.addinLast(1);
        ll.addinLast(7);

        ll.Print();
        // Head = ll.MergeSort(Head);
        ll.zigZagLL();
        ll.Print();


        
    }

}
