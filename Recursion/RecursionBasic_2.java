public class RecursionBasic_2 {
    public static int Factoriyaal(int n) {
        if (n == 0) {
            return 1;
        }
        int Fnm1 = Factoriyaal(n - 1);
        int fn = n * Fnm1;
        return fn;
    }

    public static int Sumriyaal(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = Sumriyaal(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String[] args) {
        System.out.println(Factoriyaal(5));
        System.out.println(Sumriyaal(5));
    }
}
