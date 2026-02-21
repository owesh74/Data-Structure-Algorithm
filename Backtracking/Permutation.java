public class Permutation {
    public static void FindPermutation(String str, String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i<str.length(); i++){
            String TempStr = str.substring(0, i) + str.substring(i+1);
            FindPermutation(TempStr, ans+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        FindPermutation("ANS", "");
    }
}
