package com.dsa.arrays.besttimetobuyandsellstock;

/**
 * Strategy interface for the Best Time to Buy and Sell Stock problem.
 */
public interface BestTimeToBuyAndSellStockStrategy {
    /**
     * Calculates the maximum profit from stock prices.
     *
     * @param prices Array of stock prices.
     * @return Maximum profit.
     */
    int maxProfit(int[] prices);
} 