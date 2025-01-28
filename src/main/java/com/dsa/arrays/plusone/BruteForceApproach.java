package com.dsa.arrays.plusone;

/**
 * Brute Force implementation of Plus One problem.
 * 
 * Approach:
 * - Traverse the array from the end to the start.
 * - Increment the last digit and handle carry over.
 * 
 * Time Complexity: O(n) - where n is the number of digits.
 * Space Complexity: O(n) - in case of carry over, a new array is created.
 * 
 * @see PlusOneStrategy
 */
public class BruteForceApproach implements PlusOneStrategy {

    @Override
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // If we reach here, it means all digits were 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
} 