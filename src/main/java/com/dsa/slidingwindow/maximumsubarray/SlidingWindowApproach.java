package com.dsa.slidingwindow.maximumsubarray;

/**
 * Sliding Window implementation with explicit window tracking.
 * 
 * Approach:
 * 1. Maintain window with positive sum
 * 2. Expand window to include next element
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
        int windowStart = 0;
        
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            currentSum += nums[windowEnd];
            
            // Update max sum if current window is better
            maxSum = Math.max(maxSum, currentSum);
            
            // Shrink window from left until sum is positive
            while (windowStart <= windowEnd && currentSum < 0) {
                currentSum -= nums[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
} 