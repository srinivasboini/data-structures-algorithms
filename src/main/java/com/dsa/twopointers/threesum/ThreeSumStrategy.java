package com.dsa.twopointers.threesum;

import java.util.List;

/**
 * Interface for 3Sum problem.
 * 
 * Problem: Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]] 
 * such that i != j != k and nums[i] + nums[j] + nums[k] = 0.
 * 
 * Constraints:
 * - 3 <= nums.length <= 3000
 * - -10^5 <= nums[i] <= 10^5
 * 
 * @see BruteForceApproach
 * @see OptimalApproach
 */
public interface ThreeSumStrategy {
    List<List<Integer>> threeSum(int[] nums);
} 