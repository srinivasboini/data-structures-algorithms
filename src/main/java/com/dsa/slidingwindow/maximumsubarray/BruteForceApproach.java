package com.dsa.slidingwindow.maximumsubarray;

/**
 * Brute Force implementation of Maximum Subarray problem.
 * 
 * Approach:
 * - Check all possible subarrays
 * - Track maximum sum found
 * 
 * Time Complexity: O(n²) - All subarrays checked
 * Space Complexity: O(1) - No extra space used
 */
public class BruteForceApproach implements MaximumSubarrayStrategy {
    @Override
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
} 