package com.dsa.arrays.twosum;

/**
 * Strategy interface for solving the Two Sum problem.
 * 
 * Problem: Given an array of integers nums and an integer target,
 * return indices of the two numbers in nums such that they add up to target.
 * 
 * Constraints:
 * - Each input has exactly one solution
 * - Cannot use the same element twice
 * - Return the answer in any order
 * - Array length range: [2, 10^4]
 * - Number range: [-10^9, 10^9]
 * - Target range: [-10^9, 10^9]
 * 
 * @see BruteForceApproach
 * @see HashMapApproach
 * @see TwoPointerApproach
 */
public interface TwoSumStrategy {
    
    /**
     * Finds two numbers in the array that sum up to the target value.
     *
     * @param nums the input array of integers
     * @param target the target sum to find
     * @return array of two indices whose corresponding values sum to target,
     *         or empty array if no solution exists
     * @throws IllegalArgumentException if nums is null or has length less than 2
     */
    int[] findTwoSum(int[] nums, int target);
} 