package com.dsa.arrays.besttimetobuyandsellstock;

/**
 * Optimal implementation of Best Time to Buy and Sell Stock problem.
 * 
 * Approach:
 * - Track the minimum price encountered so far.
 * - Calculate the profit for each day and update the maximum profit.
 * 
 * Time Complexity: O(n) - Single pass through the array.
 * Space Complexity: O(1) - No additional space used.
 */
public class OptimalApproach implements BestTimeToBuyAndSellStockStrategy {
    @Override
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
} 