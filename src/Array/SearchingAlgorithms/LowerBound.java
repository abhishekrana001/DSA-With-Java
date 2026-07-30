package Array.SearchingAlgorithms;

// Ek sorted array aur ek target diya hai.
// Return pehla index jahan value ≥ target ho.
// Agar aisa koi element nahi hai to return arr.length.

public class LowerBound {
    public static int bound(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6};
        int target = 4;

        System.out.println("Lower Bound Of Array is: " + bound(arr, target));
    }
}
