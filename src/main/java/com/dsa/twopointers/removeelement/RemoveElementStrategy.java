package com.dsa.twopointers.removeelement;

/**
 * Interface for Remove Element problem.
 * 
 * Problem: Given an array nums and a value val, remove all instances of that value in-place 
 * and return the new length. The order of elements can be changed.
 * 
 * Constraints:
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 * 
 * @see BruteForceApproach
 * @see OptimalApproach
 */
public interface RemoveElementStrategy {
    int removeElement(int[] nums, int val);
} 