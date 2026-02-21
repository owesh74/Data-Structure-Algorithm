public class RecursionBasic_1 {

    public static void RecDec(int n){
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        RecDec(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        RecDec(5);
    }
} 