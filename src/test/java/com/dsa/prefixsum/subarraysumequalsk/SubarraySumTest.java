package com.dsa.prefixsum.subarraysumequalsk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumTest {
    private final SubarraySumStrategy[] strategies = {
        new BruteForceApproach(),
        new PrefixSumHashMapApproach()
    };

    @Test
    void testStandardCase() {
        int[] nums = {1,-1,0};
        int k = 0;
        int expected = 3;
        assertStrategies(nums, k, expected);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {3,4,7,2,-3,1,4,2};
        int k = 7;
        int expected = 4;
        assertStrategies(nums, k, expected);
    }

    @Test
    void testZeroSum() {
        int[] nums = {0,0,0,0,0};
        int k = 0;
        int expected = 15;
        assertStrategies(nums, k, expected);
    }

    @Test
    void testMixedPositiveNegative() {
        int[] nums = {3, -1, 2, 1};
        int k = 2;
        int expected = 3;
        assertStrategies(nums, k, expected);
    }

    @Test
    void testMultipleZeroSubarrays() {
        int[] nums = {1, -1, 1, -1, 1};
        int k = 0;
        int expected = 6;
        assertStrategies(nums, k, expected);
    }

    @Test
    void testRepeatedPrefixSums() {
        int[] nums = {2, 2, -4, 4};
        int k = 4;
        int expected = 3;
        assertStrategies(nums, k, expected);
    }

    private void assertStrategies(int[] nums, int k, int expected) {
        for (SubarraySumStrategy strategy : strategies) {
            assertEquals(expected, strategy.subarraySum(nums, k),
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 