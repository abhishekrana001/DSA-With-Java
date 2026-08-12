package Recursion.AdvanceRecursion;

public class CountSubsetswithgivenSum {
    public static int countSubsets(int[] arr, int index, int currentSum, int target){
        if(index == arr.length){
            if(currentSum == target){
                return 1;
            }
            return 0;
        }
        int take = countSubsets(arr, index + 1, currentSum + arr[index], target);

        int notTake = countSubsets(arr, index + 1, currentSum , target);

        return take + notTake;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;
        System.out.println(countSubsets(arr, 0, 0, target));
    }
}
