package com.dsa.arrays.plusone;

/**
 * Interface for Plus One problem.
 * 
 * Problem: Given a non-empty array of decimal digits representing a non-negative integer, 
 * increment one to the integer.
 * 
 * Constraints:
 * - The digits are stored such that the most significant digit is at the head of the list.
 * - Each element in the array contains a single digit.
 * - The integer does not contain any leading zero, except the number 0 itself.
 * 
 * @see BruteForceApproach
 * @see OptimalApproach
 */
public interface PlusOneStrategy {
    
    /**
     * Increments the integer represented by the array by one.
     *
     * @param digits the input array of digits
     * @return the resulting array of digits after incrementing by one
     */
    int[] plusOne(int[] digits);
} 