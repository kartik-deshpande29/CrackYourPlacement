class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int current = prices[0];

        for (int i = 1; i < prices.length; i++) {
            
            if (prices[i] < current) {
                current = prices[i]; 
            }
            else {
            int profit = prices[i] - current;
            max = Math.max(max, profit);
            }
        }     
        return max;
    }
}



    //     int maxProfit = 0;
    //     int n = prices.length;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             int profit = prices[j] - prices[i];
    //             if (profit > maxProfit) {
    //                 maxProfit = profit;
    //             }
    //         }
    //     }

    //     return maxProfit;
  
