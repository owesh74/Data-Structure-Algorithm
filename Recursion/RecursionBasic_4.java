public class RecursionBasic_4 {

    public static int RecDec(int n){
        if (n == 0 || n == 1) {
            return n;            
        }
        int Fnm1 = RecDec(n-1);
        int Fnm2 = RecDec(n-2);
        int Fn = Fnm1 + Fnm2;
        return Fn;
    }
    public static void main(String[] args) {
        System.out.println(RecDec(6));
    }
} 