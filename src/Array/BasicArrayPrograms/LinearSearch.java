package BasicArrayPrograms;

public class LinearSearch {
    public static boolean searchElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        if(searchElement(arr, target)){
            System.out.println("Element Found");
        }else{
            System.out.println("Element Not Found");
        }
    }
}
