package Recursion.AdvanceRecursion;

import java.util.ArrayList;

public class GenerateAllPermutation {
    public static void permute(int[] arr, boolean[] used, ArrayList<Integer> current){
        if(current.size() == arr.length){
            System.out.println(current);
            return;
        }
        for(int i = 0; i<arr.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            current.add(arr[i]);
            permute(arr, used, current);

            current.remove(current.size()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        boolean[] used = new boolean[arr.length];
        permute(arr, used, new ArrayList<>());
    }
}
