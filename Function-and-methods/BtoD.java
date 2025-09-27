import java.util.*;

public class BtoD {

    public static int Len(int number) {
        int length = 0;

        while (number != 0) {
            number = number / 10;
            length++;
        }
        return length;
    }

    public static int Lsd(int n) {
        int lsd = n % 10;

        return lsd;
    }

    public static int BtoD(int B) {
        int Dec = 0;
        int length = Len(B);
        for (int i = 0; i <= length; i++) {
            int Cal = Lsd(B) * (int) Math.pow(2, i);
            Dec += Cal;
            B = B / 10;
        }
        return Dec;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        System.out.println(BtoD(n));
    }

}
