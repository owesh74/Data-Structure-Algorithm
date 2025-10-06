import java.sql.Array;
import java.util.Arrays;

public class assignment_1 {
    public static boolean anagrams(String str , String str2){
        if(str.length() == str2.length()){

            char[] array1 = str.toCharArray();
            char[] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);


            if(Arrays.equals(array1, array2)){
                return true;
            }else{
                return false;
            }
        }
      return false;

    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(anagrams(str1, str2));
    }
}
