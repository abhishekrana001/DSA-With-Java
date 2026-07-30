package Array.SearchingAlgorithms;

// Linear Search mein hum array ke har
// element ko ek-ek karke check karte hain jab tak target mil na jaye.

public class LinearSearch {
    public static int Linsearch(int[] arr, int target){
        int index = -1;
        for(int j=0; j<arr.length; j++){
            if(arr[j] == target) {
                index = j;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {15, 8, 21, 10, 5};
        int target = 1;

        int ans = Linsearch(arr, target);
        if(ans > -1){
            System.out.println("Target found: " + ans);
        }
        else{
            System.out.println("Target not found");
        }
    }
}
