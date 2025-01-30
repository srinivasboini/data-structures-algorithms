package com.dsa.slidingwindow.maximumsubarray;

/**
 * Interface for Maximum Subarray problem.
 * 
 * Problem: Given an integer array nums, find the contiguous subarray 
 * (containing at least one number) with the largest sum.
 * 
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * 
 * @see BruteForceApproach
 * @see KadaneApproach
 */
public interface MaximumSubarrayStrategy {
    int maxSubArray(int[] nums);
} 