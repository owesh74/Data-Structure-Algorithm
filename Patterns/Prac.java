public class Prac {
    public static void main(String[] args) {
         for (int index = 0; index < 6; index++) {
            for (int i = 0; i < index; i++) {
             if ((index+i)%2==0) {
                System.out.print("1");
             }else{
                System.out.print(0);
             }

            }
            System.out.println();
         }
    }
}

