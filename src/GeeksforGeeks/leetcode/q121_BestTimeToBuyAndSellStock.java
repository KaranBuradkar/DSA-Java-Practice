package GeeksforGeeks.leetcode;

// FIND MAX PROFIT
public class q121_BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = new int[]{7, 2, 5, 8};
        int expected = 6;

        int output = maxProfit(prices);

        if (output == expected) {
            System.out.println("PASSED: max profit - "+output);
        } else {
            System.out.println("FAILED: "+output+", EXPECTED: max profit - "+expected);
        }
    }
}
