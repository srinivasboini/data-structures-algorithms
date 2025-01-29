package com.dsa.strings.reversestring;

/**
 * Brute force implementation of Reverse String problem.
 * 
 * Approach:
 * - Use an additional array to store the reversed string.
 * 
 * Time Complexity: O(n) - Single pass through the array.
 * Space Complexity: O(n) - Additional array used.
 */
public class BruteForceApproach implements ReverseStringStrategy {
    @Override
    public void reverseString(char[] s) {
        char[] reversed = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            reversed[i] = s[s.length - 1 - i];
        }
        System.arraycopy(reversed, 0, s, 0, s.length);
    }
} 