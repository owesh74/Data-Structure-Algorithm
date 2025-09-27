import java.util.*;

public class Fun1 {

    // public static int CalSum(int a, int b) {
    // return a + b;
    // }

    // public static int CalProduct(int a, int b) {
    // return a * b;
    // }

    // public static void Swap() {
    // Scanner S = new Scanner(System.in);
    // int Num1 = S.nextInt();
    // int Num2 = S.nextInt();
    // System.out.println("before Swapping : " + Num1 + "" + Num2);

    // int Temp = Num1;
    // Num1 = Num2;
    // Num2 = Temp;

    // System.out.println("After Swapping : " + Num1 + "" + Num2);

    // }


    //Factorial
    public static int Factorial(int n) {

        int Fact = 1;
        for (int i = 1; i <= n; i++) {
            Fact = Fact * i;
        }
        return Fact;
    }

    //Binomial cofficient
    public static int Binomial(int n, int r) {
        return (Factorial(n)) / (Factorial(r) * (Factorial(n - r)));
    }


    //Prime Number 
    public static boolean checkPrime(int n) {
        boolean isPrime = true; 
        if (n == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= n - 1; i++) { //to make this Optimize use sqrt of n instead of n -1
                if (n % i == 0) {
                    isPrime = false;
                }

            }
        }
        return isPrime;
    }

    //Prime Number in Range of n
    public static void PrimeinRange(int R) { 
        for(int i=2; i<=R ;i++){
            if(checkPrime(i) == true){
                System.out.println(i);
            }
        }
    }




    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

    }
}
