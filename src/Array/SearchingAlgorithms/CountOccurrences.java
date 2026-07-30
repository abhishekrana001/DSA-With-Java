package Array.SearchingAlgorithms;

public class CountOccurrences {
    public static int count(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {15, 8, 21, 8, 10, 5, 8};
        int target = 8;

        System.out.println("Count Occurrences is: " +  count(arr, target));
    }
}
