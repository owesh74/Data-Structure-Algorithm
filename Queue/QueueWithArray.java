public class QueueWithArray{

    static class Queue{
    static int arr[];
    static int Size;
    static int rear;

        Queue(int n){
            arr = new int[n];
            Size = n;
            rear = -1;
        }
 
        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if (rear == Size-1) {
                System.out.println("Queue is Full");
                return;
            }
            rear += 1;
            arr[rear] = data;
        }

        public static int Remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int Front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear -= 1;
            return Front;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

             return arr[0];
        }
    }
    public static void main(String[] args) {
     Queue q = new Queue(5);
     q.add(1);   
     q.add(2);   
     q.add(3);   
     q.add(4);   
     q.add(5); 



     while (!q.isEmpty()) {
             System.out.println(q.peek());
             q.Remove();
     }
       
    }

}