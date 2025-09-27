import java.util.*;

public class Palindrome {

    public static boolean isPalindrone(int n) {
        int Frev = n;
        int Rev = 0;
        int Lsd = 0;
    
        while(n > 0){
            Lsd = n % 10;
            Rev = (Rev * 10) + Lsd;
            n /= 10;     
        }

        if(Rev == Frev){
            return true;
        }
        else{
        return false;
    }
}




    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
       System.out.println( isPalindrone(n));
    }
}
