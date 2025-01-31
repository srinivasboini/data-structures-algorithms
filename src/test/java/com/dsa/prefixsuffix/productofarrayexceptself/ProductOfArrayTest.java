package com.dsa.prefixsuffix.productofarrayexceptself;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayTest {
    private final ProductOfArrayStrategy[] strategies = {
        new BruteForceApproach(),
        new PrefixSuffixApproach()
    };

    @Test
    void testStandardCase() {
        int[] nums = {1,2,3,4};
        int[] expected = {24,12,8,6};
        assertStrategies(nums, expected);
    }

    @Test
    void testWithZero() {
        int[] nums = {0,1,2,3};
        int[] expected = {6,0,0,0};
        assertStrategies(nums, expected);
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1,1,0,-3,3};
        int[] expected = {0,0,9,0,0};
        assertStrategies(nums, expected);
    }

    private void assertStrategies(int[] input, int[] expected) {
        for (ProductOfArrayStrategy strategy : strategies) {
            assertArrayEquals(expected, strategy.productExceptSelf(input),
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 