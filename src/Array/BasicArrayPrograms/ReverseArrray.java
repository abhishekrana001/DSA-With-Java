package BasicArrayPrograms;

public class ReverseArrray {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = Array.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            int temp = Array[left];
            Array[left] = Array[right];
            Array[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i < n; i++){
            System.out.print(Array[i] + " ");
        }
    }
}
