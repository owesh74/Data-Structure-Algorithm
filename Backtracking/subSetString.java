public class subSetString {
    public static void FindSub(String str, String ans , int i){
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        FindSub(str, ans+str.charAt(i), i+1);

        FindSub(str, ans, i+1);
    }
    public static void main(String[] args) {
        FindSub("abc", "", 0);
    }
}
