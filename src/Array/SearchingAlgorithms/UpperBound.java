package Array.SearchingAlgorithms;

public class UpperBound {
//    Ek sorted array aur ek target diya hai.
//    Return pehla index jahan value > target ho.
//    Agar aisa koi element nahi hai to return arr.length.

    public static int bound(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6};
        int target = 4;

        System.out.println("Upper Bound is: " + bound(arr, target));
    }
}
