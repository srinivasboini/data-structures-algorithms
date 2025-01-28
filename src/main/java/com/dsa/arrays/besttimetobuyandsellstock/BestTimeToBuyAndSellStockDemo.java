package com.dsa.arrays.besttimetobuyandsellstock;

public class BestTimeToBuyAndSellStockDemo {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        BestTimeToBuyAndSellStockStrategy bruteForce = new BruteForceApproach();
        BestTimeToBuyAndSellStockStrategy optimal = new OptimalApproach();

        System.out.println("Brute Force Approach: Max Profit = " + bruteForce.maxProfit(prices));
        System.out.println("Optimal Approach: Max Profit = " + optimal.maxProfit(prices));
    }
} 