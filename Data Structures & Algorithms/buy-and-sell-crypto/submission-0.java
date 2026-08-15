class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int windowSum = 0;
        
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                windowSum = prices[j] - prices[i];
                if (maxProfit < windowSum) {
                    maxProfit = windowSum;
                    windowSum = 0;
                }
            }
        }

        if (maxProfit < 0)
            maxProfit = 0;

        return maxProfit;
    }
}
