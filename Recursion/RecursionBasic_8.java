public class RecursionBasic_8 {
   
    public static int Tiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int Fnm1 = Tiling(n-1);
        System.out.println( " n = " + Fnm1);
        int Fnm2 = Tiling(n-2);
        System.out.println( " n = " + Fnm2);
        System.out.println(Fnm1 + Fnm2);
        return Fnm1 + Fnm2;
    }
    public static void main(String[] args) {
        System.out.println(Tiling(6));
    }
}