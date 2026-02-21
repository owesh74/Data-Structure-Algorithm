public class RecursionBasic_12 {
   public static void TowerOfHanoi(int n , String A, String B, String C){
    if(n == 1){
        System.out.println("Transfer Disk " + n + " From " + A + " to " + C);
        return;
    }

    TowerOfHanoi(n-1, A, B, C);

    System.out.println("Transfer Disk " + n + " From " + A + " to " + B);

    TowerOfHanoi(n-1, C, A, B);


   }  
    public static void main(String[] args) {
        TowerOfHanoi(64, "A", "B", "C");
    }
}
