package Array.IntermediatePrograms;

import static java.lang.Integer.MAX_VALUE;

public class SecondSmallestElement {

    public static int smallestElement(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < secondSmallest && arr[i] > smallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {1 ,7 , 2, 4, 5, 9, 10, 77, 90};
        System.out.println("Second Smallest Element: " + smallestElement(arr));
    }
}
