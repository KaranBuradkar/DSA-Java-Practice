package GeeksforGeeks.DataStructures.Array;

// TASK: Given an array prices[] of non-negative integers, representing the
// prices of the stocks on different days. The task is to find the maximum
// profit possible by buying and selling the stocks on different days when
// at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.
// If it is not possible to make a profit then return 0.
// DIFFICULTY: EASY
// LINK: https://www.geeksforgeeks.org/problems/buy-stock-2/1
// INPUT: prices = [7, 10, 1, 3, 6, 9, 2]
// OUTPUT: 8

public class StockBuyAndSell_MaxOneTransactionAllowed {
    public static int maxProfit(int[] prices) {
        // Code here
        if(prices.length == 1) return 0;
        
        int profit = 0, low = prices[0], high = prices[0]; 
        for(int p : prices) {
            if(high < p) high = p;
            else {
                int temp = high - low;
                profit = Math.max(temp, profit);
                
                if(low > p) {
                    high = p;
                    low = p;
                }
            }
        }
        
        int temp = high - low;
        profit = Math.max(temp, profit);
        
        return profit;
    }

    // Simplest by gfg
    private static int maxProfit2(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;


        for (int i = 1; i < prices.length; i++) {

            // Update the minimum value seen so far
            minSoFar = Math.min(minSoFar, prices[i]);

            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}