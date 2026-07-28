package Array.IntermediatePrograms;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 1};
        boolean[] flag = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(flag[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    flag[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }
}
