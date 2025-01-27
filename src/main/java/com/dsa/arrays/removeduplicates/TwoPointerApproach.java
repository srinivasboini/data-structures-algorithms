package com.dsa.arrays.removeduplicates;

/**
 * Two Pointer implementation of Remove Duplicates from Sorted Array problem.
 * 
 * Approach:
 * - Use two pointers: i (slow) and j (fast)
 * - i tracks the position for next unique element
 * - j scans through the array looking for unique elements
 * - When a unique element is found, place it at position i+1
 * 
 * Time Complexity: O(n) - where n is the length of input array
 * - Single pass through the array
 * 
 * Space Complexity: O(1)
 * - Only uses constant extra space
 * 
 * @see RemoveDuplicatesStrategy
 */
public class TwoPointerApproach implements RemoveDuplicatesStrategy {
    
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        if (nums.length <= 1) {
            return nums.length;
        }
        
        int i = 0; // Position of last unique element
        
        // j scans for unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }

    public static void main(String[] args) {
        TwoPointerApproach solution = new TwoPointerApproach();
        System.out.println("Two Pointer Approach Demo:");
        RemoveDuplicatesDemo.runTestCases(solution);
    }
} 