package JavaBasics;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = 40;

        if (a >= b && a >= c){
            System.out.println(a + " is Largest");
        }
        else if (b >= a && b >= c){
            System.out.println(b + " is Largest");
        }
        else{
            System.out.println(c + " is Largest");
        }
    }
}
