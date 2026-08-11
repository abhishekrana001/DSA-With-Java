package Recursion.IntermediateRecursion;

public class FirstOcc {
    public static int first(int[] arr, int target, int index){
        if(arr.length == 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return first(arr,target,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;
        System.out.println(first(arr,target,0));
    }
}
