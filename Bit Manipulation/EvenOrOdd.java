import java.util.*;

public class EvenOrOdd {
    public static Boolean isEven(int n){
        if((n & 1) == 1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int Num = S.nextInt();
        if (isEven(Num) == true){
            System.out.println(Num + " is Even");
        }else{
            System.out.println(Num + " is Not Even");
        }

       
    }
}