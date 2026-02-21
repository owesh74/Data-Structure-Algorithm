public class RecursionBasic_9 {
    public static void RemoveDuplicateChar(String str , int i , StringBuilder newString , boolean map[]){
    if (i == str.length()) {
        System.out.println(newString);
        return;
    }

    char currChar = str.charAt(i);
    if(map[currChar-'a'] == true){
        RemoveDuplicateChar(str , i+1 , newString , map);
    }else{
        map[currChar-'a'] = true;
        RemoveDuplicateChar(str , i+1 , newString.append(currChar) , map);
    }
    }
    public static void main(String[] args) {
    RemoveDuplicateChar("owweesshhh", 0, new StringBuilder(""), new boolean[26]);
    }
}
