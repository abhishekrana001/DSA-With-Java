package Recursion.AdvanceRecursion;

import java.util.ArrayList;

public class PrintallSubsetsofanarray {
    public static void printSubset(int[] arr, int index, ArrayList<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        current.add(arr[index]);

        printSubset(arr, index + 1, current);

        current.remove(current.size() - 1);
        printSubset(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubset(arr, 0, new ArrayList<>());
    }
}
