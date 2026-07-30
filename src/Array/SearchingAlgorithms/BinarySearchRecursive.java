package Array.SearchingAlgorithms;
//  Question: Binary Search (Recursive):-

//  Ab tak hum Iterative Binary Search (while loop) kar rahe the.
//  Ab wahi kaam Recursion se karna hai.

public class BinarySearchRecursive {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = recursive(arr, low, high, target);
        return ans;
    }
    public static int recursive(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return recursive(arr, low, mid - 1, target);
        }
        return recursive(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 5;

        System.out.println("Binary Search Recursive is: " + binarySearch(arr, target));
    }
}

