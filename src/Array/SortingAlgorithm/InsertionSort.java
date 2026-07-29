package Array.SortingAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};

        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
