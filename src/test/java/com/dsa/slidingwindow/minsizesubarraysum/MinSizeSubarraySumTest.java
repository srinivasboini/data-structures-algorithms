package com.dsa.slidingwindow.minsizesubarraysum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MinSizeSubarraySumTest {
    private final MinSizeSubarraySumStrategy[] strategies = {
        new BruteForceApproach(),
        new SlidingWindowApproach()
    };

    @Test
    void testStandardCase() {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int expected = 2;
        
        for (MinSizeSubarraySumStrategy strategy : strategies) {
            assertEquals(expected, strategy.minSubArrayLen(target, nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testSingleElementCase() {
        int[] nums = {1,4,4};
        int target = 4;
        int expected = 1;
        
        for (MinSizeSubarraySumStrategy strategy : strategies) {
            assertEquals(expected, strategy.minSubArrayLen(target, nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testNoSolutionCase() {
        int[] nums = {1,1,1};
        int target = 5;
        int expected = 0;
        
        for (MinSizeSubarraySumStrategy strategy : strategies) {
            assertEquals(expected, strategy.minSubArrayLen(target, nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 