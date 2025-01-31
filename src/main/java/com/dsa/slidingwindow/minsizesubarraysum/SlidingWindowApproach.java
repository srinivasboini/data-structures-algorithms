package com.dsa.slidingwindow.minsizesubarraysum;

/**
 * Optimal implementation using Sliding Window technique.
 * 
 * Approach:
 * 1. Expand window by adding elements to right
 * 2. Shrink window from left when sum >= target
 * 3. Track minimum window length
 * 
 * Time Complexity: O(n) - Each element processed at most twice
 * Space Complexity: O(1) - Only pointers and sum variables
 */
public class SlidingWindowApproach implements MinSizeSubarraySumStrategy {
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];
            
            // Shrink window as much as possible while sum >= target
            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
} 