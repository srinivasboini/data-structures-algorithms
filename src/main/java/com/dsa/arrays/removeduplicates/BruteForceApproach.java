package com.dsa.arrays.removeduplicates;

/**
 * Brute Force implementation of Remove Duplicates from Sorted Array problem.
 * 
 * Approach:
 * - For each element, check if next element is duplicate
 * - If duplicate found, shift all remaining elements to left
 * - Continue until all duplicates are removed
 * 
 * Time Complexity: O(n²) - where n is the length of input array
 * - For each duplicate found, we need to shift remaining elements
 * - In worst case (all duplicates), we shift n elements n times
 * 
 * Space Complexity: O(1)
 * - Only uses constant extra space
 * 
 * @see RemoveDuplicatesStrategy
 */
public class BruteForceApproach implements RemoveDuplicatesStrategy {
    
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        
        int length = nums.length;
        int i = 0;
        
        while (i < length - 1) {
            // Check if current element is same as next element
            if (nums[i] == nums[i + 1]) {
                // Shift all elements to left starting from i + 1
                for (int j = i + 1; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                // Reduce array length as we removed one element
                length--;
            } else {
                // Move to next element if no duplicate found
                i++;
            }
        }
        
        return length;
    }

    /**
     * Demonstrates the Brute Force approach with various test cases.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        BruteForceApproach solution = new BruteForceApproach();
        System.out.println("Brute Force Approach Demo:");
        RemoveDuplicatesDemo.runTestCases(solution);
    }
}