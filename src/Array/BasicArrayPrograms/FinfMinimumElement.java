package BasicArrayPrograms;

import static java.lang.Integer.MAX_VALUE;

public class FinfMinimumElement {
    public static int minimumElement(int[] arr) {
        int minimum = MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] arr = { -1000, 2, 3, 4, 5 };
        System.out.println("Minimum Element in the Array: " + minimumElement(arr));
    }
}
