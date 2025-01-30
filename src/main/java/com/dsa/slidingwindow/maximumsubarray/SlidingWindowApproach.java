package com.dsa.slidingwindow.maximumsubarray;

/**
 * Sliding Window implementation of Maximum Subarray problem.
 * 
 * Approach:
 * 1. Maintain window with positive sum
 * 2. Expand right when sum is positive
 * 3. Reset window when sum becomes negative
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class SlidingWindowApproach implements MaximumSubarrayStrategy {
    @Override
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            
            // Update max if current window is better
            maxSum = Math.max(maxSum, currentSum);
            
            // Reset window if sum becomes negative
            if (currentSum < 0) {
                left = right + 1;
                currentSum = 0;
            }
        }
        return maxSum;
    }
} 