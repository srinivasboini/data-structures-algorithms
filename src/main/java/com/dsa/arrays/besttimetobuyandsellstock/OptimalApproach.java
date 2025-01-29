package com.dsa.arrays.besttimetobuyandsellstock;

/**
 * Simplified optimal solution for Best Time to Buy and Sell Stock.
 * Tracks minimum buy price and maximum profit in a single pass.
 * 
 * Time Complexity: O(n) - One iteration through prices
 * Space Complexity: O(1) - Uses only two variables
 */
public class OptimalApproach implements BestTimeToBuyAndSellStockStrategy {
    @Override
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int minBuyPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // Update minimum price seen so far
            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            } 
            // Update maximum profit if current profit is higher
            else {
                int currentProfit = prices[i] - minBuyPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
} 