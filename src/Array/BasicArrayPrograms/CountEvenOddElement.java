package BasicArrayPrograms;

public class CountEvenOddElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Even++;
            }else{
                Odd++;
            }
        }
        System.out.println("Even Element: " + Even + " "+ "Odd Element: " + Odd);
    }
}
