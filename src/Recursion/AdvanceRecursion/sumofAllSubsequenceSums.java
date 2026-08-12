package Recursion.AdvanceRecursion;

public class sumofAllSubsequenceSums {
    public static int sum(int[] arr, int index, int currentSum) {
        if(index == arr.length){
            return currentSum;
        }
        int take = sum(arr, index + 1, currentSum + arr[index]);

        int notTake = sum(arr, index + 1, currentSum );

        return take + notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(sum(arr, 0, 0));
    }
}
