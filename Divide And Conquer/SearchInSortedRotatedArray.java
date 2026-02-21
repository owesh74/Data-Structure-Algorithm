public class SearchInSortedRotatedArray {
    public static int binarysearchmodified(int arr[], int key, int si , int ei){
        int mid = si + (ei-si) / 2;
        if(si > ei){
            return -1;
        }

        if(arr[mid] == key){
            return mid;
        }

        //L1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= key && key <= arr[mid]){
                return binarysearchmodified(arr, key, si, mid-1);
            }else{
                return binarysearchmodified(arr, key, mid+1, ei);
            }
        }
        //L2
        else{
            if(arr[mid] <= key && key <= arr[ei]){
                    return binarysearchmodified(arr, key, mid+1, ei);
            }else{
                    return binarysearchmodified(arr, key, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(binarysearchmodified(arr, 6, 0, arr.length-1));
    }
}
