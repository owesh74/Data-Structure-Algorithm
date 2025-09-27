public class Sumof {
   
   public static int sum(int n){
    int Lsd = 0;
    int Ans = 0;
    while(n > 0 ){
        Lsd = n % 10;
        Ans = Ans + Lsd;
        n /= 10;
    }
return Ans;
}
    public static void main(String[] args) {
       System.out.println(sum(5345)); 
    }
}
