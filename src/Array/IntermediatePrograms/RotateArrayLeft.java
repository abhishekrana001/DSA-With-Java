package Array.IntermediatePrograms;

public class RotateArrayLeft {
//    Rotate Array Left into 1 round...

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int temp = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;
        System.out.println();
        System.out.println("Rotated Array : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
