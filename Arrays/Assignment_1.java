public class Assignment_1 {

    public static boolean Qution1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int Qution2(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return target;
            }

            if (arr[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return -1;
    }

    public static void Qution3(int arr[]) {
        int Total = 0;
        // Calculating Left Max
        int LeftMax[] = new int[arr.length];
        LeftMax[0] = arr[0];
        for (int i = 1; i < LeftMax.length; i++) {
            LeftMax[i] = Math.max(LeftMax[i - 1], arr[i]);

        }
    

            // Calculating Right Max
        int RightMax[] = new int[arr.length];
        RightMax[arr.length-1] = arr[arr.length-1];
        for (int i = RightMax.length-2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], arr[i]);

        }
        

        for (int i = 0; i < arr.length; i++) {
            int Minhight = Math.min(LeftMax[i], RightMax[i]);
            int WaterLevel = Minhight - arr[i];
            if(WaterLevel < 0){
                WaterLevel = 0;
            }
            Total+=WaterLevel;
        }
        System.err.println(Total);
    
    }

    public static void ThreeSum(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("[ " + arr[i] + " " + arr[j] + " " + arr[k] + " ]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int arr[] = {-1,0,1,2,-1,-4};

        // System.out.println(Qution1(arr));
        // System.out.println(Qution2(arr , 4));
        // Qution3(arr);
        ThreeSum(arr);
    }
}
