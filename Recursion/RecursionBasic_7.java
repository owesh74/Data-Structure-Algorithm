public class RecursionBasic_7 {
    // public static int Power(int x , int n){
    //     if(n == 0){
    //         return 1;
    //     }

    //     return x * Power(x, n-1);
    // }


    public static int PowerOptimize(int x , int n){
        if(n == 0){
            return 1;
        }

        int PowerOpt = PowerOptimize(x, n/2);
        int PowerOptsq = PowerOpt * PowerOpt;

        if(n % 2 != 0){
            PowerOptsq = x * PowerOptsq;
        }

        return PowerOptsq;
    }
    public static void main(String[] args) {
// System.out.println(Power(2, 4));
System.out.println(PowerOptimize(2, 4));
    }
}