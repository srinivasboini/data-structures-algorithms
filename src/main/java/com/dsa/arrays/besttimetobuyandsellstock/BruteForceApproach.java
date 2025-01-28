package com.dsa.arrays.besttimetobuyandsellstock;

/**
 * Brute force implementation of Best Time to Buy and Sell Stock problem.
 * 
 * Approach:
 * - Iterate over each pair of days and calculate the profit.
 * - Track the maximum profit found.
 * 
 * Time Complexity: O(n^2) - Due to nested loops.
 * Space Complexity: O(1) - No additional space used.
 */
public class BruteForceApproach implements BestTimeToBuyAndSellStockStrategy {
    @Override
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
} 