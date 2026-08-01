package Array.ExtraQuestions;

public class BestTimeToBuyandSellstock {

    public static int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;

        // int i = 1, buy = prices[0];

        // while(i < prices.length){
        //     int sell = prices[i];
        //     max = Math.max(max, sell - buy);
        //     i++;
        //     buy = Math.min(buy, prices[i-1]);
        // }

        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                max = Math.max(prices[i] - buy, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println("Best Time to Buy and Sell Stock Profit: " + maxProfit(arr));
    }
}
