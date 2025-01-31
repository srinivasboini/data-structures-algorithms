package com.dsa.slidingwindow.minsizesubarraysum;

/**
 * Interface for Minimum Size Subarray Sum problem.
 * 
 * Problem: Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a contiguous subarray whose sum is greater than or equal to target.
 * 
 * Constraints:
 * - 1 <= target <= 10^9
 * - 1 <= nums.length <= 10^5
 * - 1 <= nums[i] <= 10^4
 * 
 * @see BruteForceApproach
 * @see SlidingWindowApproach
 */
public interface MinSizeSubarraySumStrategy {
    int minSubArrayLen(int target, int[] nums);
} 