class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int total = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i-1]) {
                int profit = prices[i] - prices[i-1];
                total = total + profit;
            }
        }
        return total;
    }
}