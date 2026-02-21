import java.util.*;

public class QuesSet {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Integer> s = new Stack<>();
        Node tempNode = head;
        while (tempNode != null) {
            s.push(tempNode.data);
            tempNode = tempNode.next;
        }
        tempNode = head;
        while (tempNode != null) {
            if (tempNode.data != s.pop()) {
                return false;
            }
            tempNode = tempNode.next;
        }
        return true;
    }

    public static void main(String[] args) {

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome(one);
        System.out.println("Palindrome :" + condition);
        
      

    }
}
