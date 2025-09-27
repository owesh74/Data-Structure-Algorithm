import java.util.*;
public class DtoB {

    public static int DecToBin(int n) {

        int res;
        int i = 0;
        int Finalres = 0;
        while (n > 0) {

            res = n % 2;
            Finalres = Finalres + (res * (int) Math.pow(10, i));
            n = n / 2;
            i++;
        }
        return Finalres;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        System.out.println(DecToBin(n));

    }

}
