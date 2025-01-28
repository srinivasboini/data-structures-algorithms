package com.dsa.arrays.plusone;

/**
 * Optimal implementation of Plus One problem.
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
public class OptimalApproach implements PlusOneStrategy {

    @Override
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // If we reach here, it means all digits were 9
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
} 