package Array.SearchingAlgorithms;

//  Floor = Target se chhota ya equal (<=) sabse bada element.
//  Ceil = Target se bada ya equal (>=) sabse chhota element.

public class FloorCeil {
    public static int floor(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int ceiling(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,10};
        int target = 5;

        System.out.println("Floor is: " + floor(arr, target));
        System.out.println("ceiling is: " + ceiling(arr, target));
    }
}
