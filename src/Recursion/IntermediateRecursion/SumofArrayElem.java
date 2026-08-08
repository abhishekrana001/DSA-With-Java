package Recursion.IntermediateRecursion;

public class SumofArrayElem {
    public static int sum(int[] arr, int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        return arr[index] + sum(arr,index+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Sum of Array Element using recursion is: " + sum(arr,0));
    }
}
