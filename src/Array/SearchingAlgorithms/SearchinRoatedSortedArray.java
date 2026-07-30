package Array.SearchingAlgorithms;

// Question: Search in Rotated Sorted Array (LeetCode 33)
// Difficulty: Medium

// Problem Statement:-
// Ek sorted array ko kisi point se rotate kar diya gaya hai.
// Ab target diya hai.
// Agar target mile to uska index return karo.

public class SearchinRoatedSortedArray {
    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if(target >= arr[low] && target < arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if(target <= arr[high] && target > arr[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println("Search in Roated Array is: " + search(arr,target));
    }
}
