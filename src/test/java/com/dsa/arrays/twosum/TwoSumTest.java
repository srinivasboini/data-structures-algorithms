package com.dsa.arrays.twosum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSumStrategy[] solutions = {
        new BruteForceApproach(),
        new HashMapApproach(),
        new TwoPointerApproach()
    };

    @Test
    void testBasicCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        
        for (TwoSumStrategy solution : solutions) {
            assertArrayEquals(expected, solution.findTwoSum(nums, target),
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }

    @Test
    void testWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int[] expected = {2, 4};
        
        for (TwoSumStrategy solution : solutions) {
            assertArrayEquals(expected, solution.findTwoSum(nums, target),
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }

    @Test
    void testNoSolution() {
        int[] nums = {1, 2, 3, 4};
        int target = 10;
        int[] expected = {};
        
        for (TwoSumStrategy solution : solutions) {
            assertArrayEquals(expected, solution.findTwoSum(nums, target),
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }

    @Test
    void testDuplicateNumbers() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        
        for (TwoSumStrategy solution : solutions) {
            assertArrayEquals(expected, solution.findTwoSum(nums, target),
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }
} 