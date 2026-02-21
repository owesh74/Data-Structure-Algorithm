public class CircularQueueWithArray{

    public static class Queue{
    static int arr[];
    static int Size;
    static int rear;
    static int Front;

        Queue(int n){
            arr = new int[n];
            Size = n;
            rear = -1;
            Front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && Front == -1;
        }
        public static boolean isFull(){
            return (rear + 1) % Size == Front; 
        }

        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (Front == -1) {
                Front = 0;
            }
            rear = (rear + 1) % Size;
            arr[rear] = data;
        }

        public static int Remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int Res = arr[Front];
           if (rear == Front) {
            rear = Front = -1;
           }else{
            Front = (Front+1) % Size;
           }
           return Res;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

             return arr[Front];
        }
    }
    public static void main(String[] args) {
     Queue q = new Queue(3);
     q.add(1);   
     q.add(2);   
     q.add(3);   


q.Remove();
q.add(4);
     while (!q.isEmpty()) {
             System.out.println(q.peek());
             q.Remove();
     }
       
    }

}