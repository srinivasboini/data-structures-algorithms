package com.dsa.twopointers.removeelement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    private final RemoveElementStrategy[] strategies = {
        new BruteForceApproach(),
        new OptimalApproach()
    };

    @Test
    void testStandardCase() {
        int[] nums = {3,2,2,3};
        int val = 3;
        int expectedLength = 2;
        int[] expectedArray = {2,2};
        
        for (RemoveElementStrategy strategy : strategies) {
            int[] copy = nums.clone();
            int result = strategy.removeElement(copy, val);
            assertEquals(expectedLength, result);
            assertArrayPrefix(expectedArray, copy, result);
        }
    }

    @Test
    void testAllElementsRemoved() {
        int[] nums = {2,2,2,2};
        int val = 2;
        int expectedLength = 0;
        
        for (RemoveElementStrategy strategy : strategies) {
            int[] copy = nums.clone();
            int result = strategy.removeElement(copy, val);
            assertEquals(expectedLength, result);
        }
    }

    @Test
    void testNoElementsRemoved() {
        int[] nums = {1,2,3,4};
        int val = 5;
        int expectedLength = 4;
        int[] expectedArray = {1,2,3,4};
        
        for (RemoveElementStrategy strategy : strategies) {
            int[] copy = nums.clone();
            int result = strategy.removeElement(copy, val);
            assertEquals(expectedLength, result);
            assertArrayPrefix(expectedArray, copy, result);
        }
    }

    private void assertArrayPrefix(int[] expected, int[] actual, int length) {
        for (int i = 0; i < length; i++) {
            assertEquals(expected[i], actual[i], "Mismatch at index " + i);
        }
    }
} 