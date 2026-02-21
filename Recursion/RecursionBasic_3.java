public class RecursionBasic_3 {
//Fibonachi With Loop
    public static void RecDec(int n){
    int out = 0;
    int out1 = 1;
    for(int i = 0 ; i < n ; i++){
        int Fi = out + out1;
        System.out.println(Fi);
        out = out1;
        out1 = Fi;

      }
    }
    public static void main(String[] args) {
        RecDec(10);
    }
} 