package BasicArrayPrograms;

public class FinfIndex {
    public static int find(int[] arr, int x) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        System.out.println("Index of the " + x + " is : " + find(arr, x));
    }
}
