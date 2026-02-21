import java.util.*;
public class NextGreater {
    
    public static void nextGreaterElement(int arr[] , int farr[]){
        Stack<Integer> s = new Stack<>();
        int nxt = 0;
        for (int i = farr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                farr[i] = -1;
            }else{
                farr[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1 , 5 , 6 , 2  , 9};
        int farr[] = new int[arr.length];

        nextGreaterElement(arr, farr);

        for (int i = 0; i < farr.length; i++) {
            System.out.println(farr[i]);
        }
 
    }
}
