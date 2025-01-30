package com.dsa.slidingwindow.maximumsubarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSubarrayTest {
    private final MaximumSubarrayStrategy[] strategies = {
        new BruteForceApproach(),
        new KadaneApproach(),
        new SlidingWindowApproach()
    };

    @Test
    void testStandardCase() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        
        for (MaximumSubarrayStrategy strategy : strategies) {
            assertEquals(expected, strategy.maxSubArray(nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testAllNegative() {
        int[] nums = {-3,-2,-1,-4};
        int expected = -1;
        
        for (MaximumSubarrayStrategy strategy : strategies) {
            assertEquals(expected, strategy.maxSubArray(nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testSingleElement() {
        int[] nums = {5};
        int expected = 5;
        
        for (MaximumSubarrayStrategy strategy : strategies) {
            assertEquals(expected, strategy.maxSubArray(nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 