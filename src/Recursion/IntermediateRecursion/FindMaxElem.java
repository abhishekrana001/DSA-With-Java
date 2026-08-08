package Recursion.IntermediateRecursion;

public class FindMaxElem {
    public static int findMax(int[] arr, int index){
        int max = 0;
        if(index == arr.length-1){
            return arr[index];
        }
        max = findMax(arr,index+1);

        if(arr[index] > max){
            max = arr[index];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Maximum Element of the Array is : "+findMax(arr,0));
    }
}
