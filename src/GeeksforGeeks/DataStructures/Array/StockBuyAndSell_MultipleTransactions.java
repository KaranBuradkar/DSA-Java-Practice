package GeeksforGeeks.DataStructures.Array;

// TASK: The cost of stock on each day is given in an array price[].
// Each day you may decide to either buy or sell the stock i at price[i],
// you can even buy and sell the stock on the same day. Find the maximum profit that you can get.
// Note: A stock can only be sold if it has been bought previously
// and multiple stocks cannot be held on any given day.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1
// INPUT: prices = [100, 180, 260, 310, 40, 535, 695]
// OUTPUT: 865

public class StockBuyAndSell_MultipleTransactions {
    public static int maxProfit(int[] prices) {
        // code here
        if(prices.length == 1) return 0;
        
        int profit = 0, low = prices[0], high = prices[0];
        for(int p : prices) {
            if(high > p) {
                int temp = high - low;
                if(temp > 0) {
                    profit = profit + temp;
                }
                
                low = p;
                high = p;
            } else {
                high = p;
            }
        }
        int temp = high - low;
        if(temp > 0) profit = profit + temp;
        
        return profit;
    }

    // simplest way gfg
    private static int maxProfit2(int[] prices) {
        int res = 0;

        // Keep on adding the difference between
        // adjacent when the prices a
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                res += prices[i] - prices[i - 1];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maxProfit(prices));
    }
}