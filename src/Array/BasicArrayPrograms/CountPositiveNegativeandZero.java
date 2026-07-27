package BasicArrayPrograms;

public class CountPositiveNegativeandZero {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, -3, 2, 3, -1, 4, 5, -2, 0};
        int Zero = 0;
        int Positive = 0;
        int Negative = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                Zero++;
            }else if(arr[i] > 0){
                Negative++;
            }else{
                Positive++;
            }
        }
        System.out.println("Zero: " + Zero);
        System.out.println("Positive: " + Positive);
        System.out.println("Negative: " + Negative);
    }
}
