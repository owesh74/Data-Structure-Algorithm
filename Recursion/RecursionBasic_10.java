public class RecursionBasic_10 {
    public static int FriendsPairing(int n){
        if (n == 1 || n == 2) {
            return n;
        }
        int Fnm1 = FriendsPairing(n-1);
        int Fnm2 = FriendsPairing(n-2);

        int Pairways = (n-1) * Fnm2;

        int TotalWays = Fnm1 + Pairways;

        return TotalWays;
    }
    public static void main(String[] args) {
        System.err.println(FriendsPairing(4));
    }
}
