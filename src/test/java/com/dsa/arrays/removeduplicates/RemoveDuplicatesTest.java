package com.dsa.arrays.removeduplicates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    
    private final RemoveDuplicatesStrategy[] solutions = {
        new BruteForceApproach(),
        new TwoPointerApproach()
    };

    @Test
    void testBasicCase() {
        int[] nums = {1, 1, 2};
        int[] expected = {1, 2};
        int expectedLength = 2;
        
        for (RemoveDuplicatesStrategy solution : solutions) {
            int[] testArray = nums.clone();
            int length = solution.removeDuplicates(testArray);
            assertEquals(expectedLength, length,
                    "Failed for " + solution.getClass().getSimpleName());
            assertArrayEquals(expected, getFirstN(testArray, length),
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }

    @Test
    void testMultipleDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected = {0, 1, 2, 3, 4};
        int expectedLength = 5;
        
        for (RemoveDuplicatesStrategy solution : solutions) {
            int[] testArray = nums.clone();
            int length = solution.removeDuplicates(testArray);
            assertEquals(expectedLength, length,
                    "Failed for " + solution.getClass().getSimpleName());
            assertArrayEquals(expected, getFirstN(testArray, length),
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int expectedLength = 0;
        
        for (RemoveDuplicatesStrategy solution : solutions) {
            int[] testArray = nums.clone();
            int length = solution.removeDuplicates(testArray);
            assertEquals(expectedLength, length,
                    "Failed for " + solution.getClass().getSimpleName());
        }
    }

    private int[] getFirstN(int[] arr, int n) {
        int[] result = new int[n];
        System.arraycopy(arr, 0, result, 0, n);
        return result;
    }
} 