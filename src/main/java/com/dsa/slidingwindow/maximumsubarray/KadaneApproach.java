package com.dsa.slidingwindow.maximumsubarray;

/**
 * Optimal implementation using Kadane's Algorithm.
 * 
 * Approach:
 * - Track maximum sum ending at current position
 * - Update global maximum when current sum exceeds it
 * 
 * Time Complexity: O(n) - Single pass through array
 * Space Complexity: O(1) - Constant space usage
 */
public class KadaneApproach implements MaximumSubarrayStrategy {
    @Override
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
} 