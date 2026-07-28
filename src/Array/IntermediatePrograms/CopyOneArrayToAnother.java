package Array.IntermediatePrograms;

public class CopyOneArrayToAnother {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            copy[i] = arr[i];
        }
        for (int j =0; j<copy.length; j++){
            System.out.print(copy[j]+" ");
        }
    }
}
