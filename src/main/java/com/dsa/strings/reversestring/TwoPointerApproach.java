package com.dsa.strings.reversestring;

/**
 * Two Pointer implementation of Reverse String problem.
 * 
 * Approach:
 * - Use two pointers, one at the start and one at the end of the array.
 * - Swap the characters at these pointers and move them towards the center.
 * 
 * Time Complexity: O(n) - Single pass through the array.
 * Space Complexity: O(1) - In-place reversal.
 */
public class TwoPointerApproach implements ReverseStringStrategy {
    @Override
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
} 