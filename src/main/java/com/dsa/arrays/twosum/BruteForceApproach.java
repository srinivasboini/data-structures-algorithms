package com.dsa.arrays.twosum;

import com.dsa.utils.ArrayUtil;

/**
 * Brute Force implementation of Two Sum problem.
 * 
 * Approach:
 * - Use nested loops to check every possible pair of numbers
 * - For each number, check if there exists another number that adds up to target
 * 
 * Time Complexity: O(n²) - where n is the length of input array
 * - Outer loop runs n times
 * - Inner loop runs n-1 times for each outer loop iteration
 * 
 * Space Complexity: O(1)
 * - Only uses a constant amount of extra space
 * 
 * @see TwoSumStrategy
 */
public class BruteForceApproach implements TwoSumStrategy {
    
    /**
     * Finds two numbers that sum to target using brute force approach.
     * 
     * @param nums the input array of integers
     * @param target the target sum to find
     * @return array of two indices whose corresponding values sum to target
     * @throws IllegalArgumentException if nums is null or has length less than 2
     */
    @Override
    public int[] findTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Return indices in ascending order
                    return new int[]{Math.min(i, j), Math.max(i, j)};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Demonstrates the Brute Force approach with various test cases.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        BruteForceApproach solution = new BruteForceApproach();
        System.out.println("Brute Force Approach Demo:");
        TwoSumDemo.runTestCases(solution);
    }
} 