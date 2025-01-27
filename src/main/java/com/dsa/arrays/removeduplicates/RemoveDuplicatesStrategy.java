package com.dsa.arrays.removeduplicates;

/**
 * Strategy interface for solving the Remove Duplicates from Sorted Array problem.
 * 
 * Problem: Given a sorted array nums, remove the duplicates in-place such that 
 * each element appears only once and return the new length.
 * 
 * Constraints:
 * - Array is sorted in non-decreasing order
 * - Modify array in-place with O(1) extra memory
 * - Array length range: [0, 3 * 10^4]
 * - Number range: [-100, 100]
 * - Return k after placing the final result in the first k slots of nums
 * 
 * Example:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * 
 * @see BruteForceApproach
 * @see TwoPointerApproach
 */
public interface RemoveDuplicatesStrategy {
    
    /**
     * Removes duplicates from a sorted array in-place.
     *
     * @param nums the input sorted array
     * @return the number of unique elements in nums
     * @throws IllegalArgumentException if nums is null
     */
    int removeDuplicates(int[] nums);
}