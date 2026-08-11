package Recursion.IntermediateRecursion;

public class LastOcc {
    public static int last(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        int result =  last(arr,target,index+1);
        if(result != -1){
            return result;
        }
        if(arr[index] == target){
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        int target = 2;
        System.out.println(last(arr,target,0));
    }
}
