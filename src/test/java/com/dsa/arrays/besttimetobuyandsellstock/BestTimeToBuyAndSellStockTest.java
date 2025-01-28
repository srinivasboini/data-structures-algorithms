package com.dsa.arrays.besttimetobuyandsellstock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Correct imports from the besttimetobuyandsellstock package

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testBruteForceApproach() {
        BestTimeToBuyAndSellStockStrategy strategy = new BruteForceApproach();
        assertEquals(5, strategy.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, strategy.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void testOptimalApproach() {
        BestTimeToBuyAndSellStockStrategy strategy = new OptimalApproach();
        assertEquals(5, strategy.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, strategy.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
} 