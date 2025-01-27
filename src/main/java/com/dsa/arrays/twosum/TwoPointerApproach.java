package com.dsa.arrays.twosum;

import java.util.Arrays;
import com.dsa.utils.ArrayUtil;

/**
 * Two Pointer implementation of Two Sum problem.
 * 
 * Approach:
 * - Sort array while keeping track of original indices
 * - Use two pointers (left and right) to find target sum
 * - Move pointers based on sum comparison with target
 * 
 * Time Complexity: O(n log n) - where n is the length of input array
 * - Sorting takes O(n log n)
 * - Two pointer traversal takes O(n)
 * 
 * Space Complexity: O(n)
 * - Additional array needed to store original indices
 * 
 * @see TwoSumStrategy
 */
public class TwoPointerApproach implements TwoSumStrategy {
    
    /**
     * Finds two numbers that sum to target using two pointer approach.
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
        
        // Create array with indices
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i] = new int[]{nums[i], i};
        }
        
        // Sort based on values
        Arrays.sort(numWithIndex, (a, b) -> a[0] - b[0]);
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                int index1 = numWithIndex[left][1];
                int index2 = numWithIndex[right][1];
                // Return indices in ascending order
                return new int[]{Math.min(index1, index2), Math.max(index1, index2)};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }

    /**
     * Demonstrates the Two Pointer approach with various test cases.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        TwoPointerApproach solution = new TwoPointerApproach();
        System.out.println("Two Pointer Approach Demo:");
        TwoSumDemo.runTestCases(solution);
    }
} 