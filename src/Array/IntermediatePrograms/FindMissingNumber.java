package Array.IntermediatePrograms;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n =arr[arr.length-1];
        int actualSum = 0;

        for(int i=0; i<arr.length; i++){
            actualSum+=arr[i];
        }
        int expectedSum = n * (n +1)/2;

        int ans = expectedSum-actualSum;
        System.out.println(ans);
    }
}
