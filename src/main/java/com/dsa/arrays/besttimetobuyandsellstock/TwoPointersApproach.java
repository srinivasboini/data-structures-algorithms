package com.dsa.arrays.besttimetobuyandsellstock;

/**
 * Two Pointers implementation of Best Time to Buy and Sell Stock.
 * 
 * Approach:
 * - Use left pointer to track buy day
 * - Use right pointer to track sell day
 * - Move pointers based on price comparisons
 * 
 * Time Complexity: O(n) - Single pass through the array
 * Space Complexity: O(1) - Only two pointers used
 */
public class TwoPointersApproach implements BestTimeToBuyAndSellStockStrategy {
    @Override
    public int maxProfit(int[] prices) {
        int left = 0; // Buy pointer
        int right = 1; // Sell pointer
        int maxProfit = 0;
        
        while (right < prices.length) {
            if (prices[right] > prices[left]) {
                // Calculate potential profit
                int currentProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            } else {
                // Found better buy price, move left pointer
                left = right;
            }
            right++; // Always move sell pointer
        }
        return maxProfit;
    }
} 