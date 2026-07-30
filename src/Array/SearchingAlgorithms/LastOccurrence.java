package Array.SearchingAlgorithms;

public class LastOccurrence {
    public static int search(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {15, 8, 21, 10, 5, 8};
        int target = 8;

        if(search(arr, target) == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target is found: " + search(arr, target));
        }

    }
}
