public class RecursionBasic_6 {

    public static int FirstOccurence(int arr[], int i, int n) {
        if (arr[i] == n) {
            return i;
        }
        if (i == arr.length - 1) {
            return -1;
        }

        return FirstOccurence(arr, i + 1, n);

    }

    public static int lastOccurence(int arr[], int i, int n) {
        if (arr[i] == n) {
            return i;
        }
        if (i == 0) {
            return -1;
        }
        return lastOccurence(arr, i - 1, n);

    }

    public static int lastOccurence2(int arr[], int n, int i) {
        if (i == arr.length) {
            System.out.println("base Case Hitted");
            return -1;
        }
        int isFound = lastOccurence2(arr, n, i+1);
        if (isFound == -1 && arr[i] == n) {
            System.out.println("Condition 2 Become true " + i + " isFound = " + isFound);

            return i;
        }

        System.out.println("Returning From Method isFound = " + isFound + " i = " + i);
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {6 , 6 , 5,  6  , 5 , 7 , 8};

        // System.out.println(FirstOccurence(arr , 0 , 5));
        System.out.println(lastOccurence2(arr, 5, 0));
        // System.out.println(arr.length);
    }
}