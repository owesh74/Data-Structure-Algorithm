import java.util.*;

public class FunctionQutions {

    // Average of 3 number
    public static int Avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int a) {
        boolean isEven = false;
        if (a % 2 == 0) {
            isEven = true;
        }
        return isEven;

    }

    public static boolean isPalindrone(int a) {
        boolean isPalindrone = false;
int FRes = a;
int power = 0;
int Res = 0;
while(a > 0){
    int Digi = a % 10;
  
    
    Res = Res + (Digi * (int)Math.pow(10, power)) ;
    
    power++;
    a = a / 10;
    
    
}
System.out.println(Res);

        if (FRes == Res) {
            isPalindrone = true;
        }

        return isPalindrone;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        // System.out.println(Avg(10,10,10));
        // System.out.println(isEven(5));

        System.out.println(isPalindrone(n));
    }
}
