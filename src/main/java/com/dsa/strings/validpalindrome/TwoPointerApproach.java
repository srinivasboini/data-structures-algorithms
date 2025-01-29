package com.dsa.strings.validpalindrome;

/**
 * Two Pointer implementation of Valid Palindrome problem.
 * 
 * Approach:
 * - Use two pointers, one at the start and one at the end of the string.
 * - Move pointers towards the center, skipping non-alphanumeric characters.
 * - Compare characters at the pointers for equality.
 * 
 * Time Complexity: O(n) - Single pass through the string.
 * Space Complexity: O(1) - In-place comparison.
 */
public class TwoPointerApproach implements ValidPalindromeStrategy {
    @Override
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
} 