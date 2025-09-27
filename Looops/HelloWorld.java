import java.util.*;

public class HelloWorld {
    public static void PrintHello(char arr[]) {
        char Start = 'a';
        for(int i = 0; i < arr.length; i++) {
            while (true) {
                if (Start != arr[i]) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(arr[j]);
                    }
                    Start++;
                    System.out.println(Start);
                } else {
                    Start = 'a';
                    break;

                }
            }
        }

    }

    public static void main(String[] args) {
        char arr[] = { 'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd' };
        PrintHello(arr);
    
    }
}
