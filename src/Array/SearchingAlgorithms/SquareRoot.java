package Array.SearchingAlgorithms;

//  Question: Square Root (LeetCode 69 - Sqrt(x)).
//  Difficulty: Easy.

//Problem Statement:-

//  Tumhe ek non-negative integer x diya gaya hai.
//  Tumhe uska integer square root return karna hai.
//  Agar square root decimal me aata hai, to sirf integer
//  part return karna hai (decimal ignore karna hai).

public class SquareRoot {
    public static int root(int x){
        int low = 0;
        int high = x;
        int ans = 0;
        while (low <= high){
            int mid = low + (high - low)/2;
            long sqrt = (long)mid * mid;
            if(sqrt == x){
               return mid;
            }else if(sqrt < x){
                ans = mid;
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 8;

        System.out.println("Square Root of " + x + " is: " + root(x));
    }
}
