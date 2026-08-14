package Recursion.AdvanceRecursion;

import java.util.ArrayList;
import java.util.List;

public class Combinationsum {

    public static void combinationSum(
            int[] arr,
            int index,
            int target,
            List<Integer> current) {

        if (target == 0) {
            System.out.println(current);
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        current.add(arr[index]);

        combinationSum(
                arr,
                index,
                target - arr[index],
                current
        );

        current.remove(current.size() - 1);

        combinationSum(
                arr,
                index + 1,
                target,
                current
        );
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};
        int target = 7;

        combinationSum(
                arr,
                0,
                target,
                new ArrayList<>()
        );
    }
}