package Array.SearchingAlgorithms;

public class BinaryCountOccurrence {
    public static int firstCount(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int first = 0;
        while (low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }
    public static int lastCount(int[] arr, int target) {
      int  low = 0;
      int high = arr.length-1;
      int last = 0;
      while (low <= high){
          int mid = (low + high) / 2;
          if(arr[mid] == target){
              last = mid;
              low = mid + 1;
          }else if(arr[mid] < target){
              low = mid + 1;
          }else{
              high = mid - 1;
          }
      }
      return last;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int count = lastCount(arr, target) - firstCount(arr, target) + 1;
        System.out.println("Count of Occurrence is: " + count);
    }
}
