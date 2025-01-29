package com.dsa.twopointers.containerwithmostwater;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {
    private final ContainerWithMostWaterStrategy[] strategies = {
        new BruteForceApproach(),
        new OptimalApproach()
    };

    @Test
    void testBasicCase() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        
        for (ContainerWithMostWaterStrategy strategy : strategies) {
            assertEquals(expected, strategy.maxArea(height), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testEdgeCase1() {
        int[] height = {1,1};
        int expected = 1;
        
        for (ContainerWithMostWaterStrategy strategy : strategies) {
            assertEquals(expected, strategy.maxArea(height), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testDescendingHeights() {
        int[] height = {5,4,3,2,1};
        int expected = 6;
        
        for (ContainerWithMostWaterStrategy strategy : strategies) {
            assertEquals(expected, strategy.maxArea(height), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 