import java.util.*;
public class String_1{

    public static void StringPrint(String Str){
        for (int i = 0; i < Str.length(); i++) {
            System.out.print(Str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //String are Immutable
        Scanner S = new Scanner(System.in);
        String FirstName = S.nextLine();
        String LastName = S.nextLine();
        String FullName = FirstName + " " + LastName;
        


        StringPrint(FullName);
    }
}