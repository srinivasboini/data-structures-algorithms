package com.dsa.twopointers.removeelement;

/**
 * Optimal implementation using Two Pointer technique.
 * 
 * Approach:
 * - Use slow/fast pointers
 * - Overwrite target elements with non-target elements
 * - Single pass through array
 * 
 * Time Complexity: O(n) - Single iteration
 * Space Complexity: O(1) - In-place modification
 */
public class OptimalApproach implements RemoveElementStrategy {
    @Override
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
} 