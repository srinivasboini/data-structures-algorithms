package com.dsa.twopointers.threesum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

class ThreeSumTest {
    private final ThreeSumStrategy[] strategies = {
        new BruteForceApproach(),
        new OptimalApproach()
    };

    @Test
    void testBasicCase() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> expected = List.of(
            List.of(-1,-1,2),
            List.of(-1,0,1)
        );
        
        for (ThreeSumStrategy strategy : strategies) {
            assertEquals(expected, strategy.threeSum(nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testAllZeros() {
        int[] nums = {0,0,0,0};
        List<List<Integer>> expected = List.of(
            List.of(0,0,0)
        );
        
        for (ThreeSumStrategy strategy : strategies) {
            assertEquals(expected, strategy.threeSum(nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    @Test
    void testNoSolution() {
        int[] nums = {1,2,3,4};
        List<List<Integer>> expected = List.of();
        
        for (ThreeSumStrategy strategy : strategies) {
            assertEquals(expected, strategy.threeSum(nums), 
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 