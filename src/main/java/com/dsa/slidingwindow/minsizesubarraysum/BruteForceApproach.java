package com.dsa.slidingwindow.minsizesubarraysum;

/**
 * Brute Force implementation of Minimum Size Subarray Sum problem.
 * 
 * Approach:
 * - Check all possible subarrays
 * - Track minimum length of valid subarrays
 * 
 * Time Complexity: O(n²) - All subarrays checked
 * Space Complexity: O(1) - No extra space used
 */
public class BruteForceApproach implements MinSizeSubarraySumStrategy {
    @Override
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum >= target) {
                    minLength = Math.min(minLength, j - i + 1);
                    break; // Found smallest possible for this i
                }
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
} 