public class MergeSortLL {
    
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

    private Node merge(Node LeftHead, Node RightHead){
        Node MergedLL = new Node(-1);
        Node temp = MergedLL;

        while (LeftHead != null && RightHead != null) {
            if (LeftHead.data <= RightHead.data) {
                MergedLL.nxt = LeftHead;
                LeftHead = LeftHead.nxt;
             
            }else {
                MergedLL.nxt = RightHead;
                RightHead = RightHead.nxt;
                
            }
            MergedLL = MergedLL.nxt;
        }

         while (RightHead != null) {
                MergedLL.nxt = RightHead;
                RightHead = RightHead.nxt;
                MergedLL = MergedLL.nxt;
         }

         while (LeftHead != null) {
            MergedLL.nxt = LeftHead;
            LeftHead = LeftHead.nxt;
            MergedLL = MergedLL.nxt;
         }

         return temp.nxt;
    }

    private Node getMid(Node Head){
        Node Fast = Head.nxt;
        Node Slow = Head;
        while (Fast != null && Fast.nxt != null ) {
            Slow = Slow.nxt;
            Fast = Fast.nxt.nxt;


        }
        return Slow;
    }

    public Node MergeSort(Node Head){
        if (Head == null || Head.nxt == null) {
            return Head;
        }

        Node Mid = getMid(Head);
        Node RightHead = Mid.nxt;
        Mid.nxt = null;
        Node Left = MergeSort(Head);
        Node Right = MergeSort(RightHead);

        return merge(Left , Right);
    }


    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addinFirst(2);
        ll.addinFirst(7);
        ll.addinFirst(9);
        ll.addinLast(98);
        ll.addinLast(1);

        ll.Print();
        Head = ll.MergeSort(Head);
        ll.Print();


        
    }

}
