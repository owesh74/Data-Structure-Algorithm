public class CountSetBits {
    public static int Count(int n){
        int count = 0;
        int i = 0;
        while(n > 0){
            if ((n & 1) == 1) {
                count += 1;
            }
            n = n >> i;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Count(15));
    }
}
