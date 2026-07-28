package Array.IntermediatePrograms;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {6, 7, 8, 9, 10};

        int n1 = arr.length;
        int n2 = arr1.length;

        int[] result = new int[n1 + n2];
        for(int i=0; i<n1; i++){
            result[i] = arr[i];
        }
        for(int i=0; i<n2; i++){
            result[n1+i] = arr1[i];
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }
}
