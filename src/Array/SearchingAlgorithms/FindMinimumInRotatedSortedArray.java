package Array.SearchingAlgorithms;

// Question: Find Minimum in Rotated Sorted Array (LeetCode 153).
// Difficulty: Medium

// Problem Statement:-
// Ek sorted array ko rotate kiya gaya hai.
// Tumhe minimum element return karna hai.

import static java.lang.Integer.MAX_VALUE;

public class FindMinimumInRotatedSortedArray {

// Question: Search in Rotated Sorted Array (LeetCode 33)
// Difficulty: Medium

// Problem Statement:-
// Ek sorted array ko kisi point se rotate kar diya gaya hai.
// Ab target diya hai.
// Agar target mile to uska index return karo.

    public static int search(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[mid] ) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2};

        System.out.println("Find Minimum Rotated Sorted Array is: " + search(arr));
    }
}

