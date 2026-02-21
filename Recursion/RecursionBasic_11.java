public class RecursionBasic_11 {
    public static int AllOccurence(int arr[] , int key , int i){
        if(i == arr.length){
            return i;
        }
        
        if (arr[i] == key) {
            System.out.println(i + " ");
        }

        return AllOccurence(arr, key, i+1);
        
    }

    public static void NumConverter(String chars[] , int n){
        if (n == 0) {
            return;
        }
        int Ld = n % 10;
   
        NumConverter(chars, n / 10);
        System.out.print(chars[Ld] + " ");
        }

        public static int Length(String str){
            if(str.length() == 0){
                return 0;
            }
           
            return Length(str.substring(1)) + 1;
        }
    

         public static void ContinuousSubstring(String str, int i, int res, int j) {
            // Base Case: If we reach the end of the string
            if (i == str.length()) {
                return;
            }
        
            // Base Case: If j exceeds the length of the string
            if (j > str.length()) {
                ContinuousSubstring(str, i + 1, res, i + 2);
                return;
            }
        
            // Extract the substring from index i to j
            String substring = str.substring(i, j);
        
            // Check if the first and last characters are the same
            if (substring.charAt(0) == substring.charAt(substring.length() - 1)) {
                res++;
                System.out.println("Substring: " + substring + ", Start Index: " + i + ", Count: " + res);
            }
        
            // Recursive call to check the next substring with a longer length
            ContinuousSubstring(str, i, res, j + 1);
        }
        
    
        
    public static void main(String[] args) {
        // int arr[] = {2, 3, 5, 7, 2, 4, 7, 3,7};
        // AllOccurence(arr, 7 , 0);
        // String chars[] = {"Zero" , "One" , "Tow" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten"};
        // NumConverter(chars,12340);
        // System.out.println(Length("Owesssssssh"));
        String str = "abcab";
        ContinuousSubstring(str, 0, 0, 1);
    }
}
