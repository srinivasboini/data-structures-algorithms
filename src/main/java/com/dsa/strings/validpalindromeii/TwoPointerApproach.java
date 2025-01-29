package com.dsa.strings.validpalindromeii;

/**
 * Two Pointer implementation of Valid Palindrome II problem.
 * 
 * Approach:
 * - Use two pointers to check for palindrome.
 * - Allow one character removal when a mismatch is found.
 * 
 * Time Complexity: O(n) - Single pass through the string.
 * Space Complexity: O(1) - In-place comparison.
 */
public class TwoPointerApproach implements ValidPalindromeIIStrategy {
    @Override
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
} 