package com.dsa.twopointers.removeelement;

/**
 * Brute Force implementation of Remove Element problem.
 * 
 * Approach:
 * - Iterate through the array
 * - When target found, shift subsequent elements left
 * - Repeat until all instances removed
 * 
 * Time Complexity: O(n²) - Worst case shifting for each element
 * Space Complexity: O(1) - In-place modification
 */
public class BruteForceApproach implements RemoveElementStrategy {
    @Override
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                length--;
                i--; // Re-check shifted element
            }
        }
        return length;
    }
} 