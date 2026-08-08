package Recursion.IntermediateRecursion;

public class CheckArraySorted {
    public static boolean check(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return check(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3};
        System.out.println(check(arr,0));
    }
}
