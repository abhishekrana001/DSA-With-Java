package Array.SortingAlgorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 1};
        int minimumIndex =  0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minimumIndex]){
                    minimumIndex = j;
                }
            }
            int temp =  arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = temp;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
