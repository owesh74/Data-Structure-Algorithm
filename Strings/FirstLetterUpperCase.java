import java.util.*;

public class FirstLetterUpperCase {

    public static void toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } 
            else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "hello my name is owesh";
        toUppercase(str);
    }
}
