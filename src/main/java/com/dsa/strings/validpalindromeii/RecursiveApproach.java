package com.dsa.strings.validpalindromeii;

/**
 * Recursive implementation of Valid Palindrome II problem.
 * 
 * Approach:
 * - Use recursion to check for palindrome with one allowed removal.
 * 
 * Time Complexity: O(n) - Single pass through the string.
 * Space Complexity: O(n) - Due to recursion stack.
 */
public class RecursiveApproach implements ValidPalindromeIIStrategy {
    @Override
    public boolean validPalindrome(String s) {
        return validPalindromeHelper(s, 0, s.length() - 1, 1);
    }

    private boolean validPalindromeHelper(String s, int left, int right, int deletionsAllowed) {
        if (left >= right) return true;
        if (s.charAt(left) == s.charAt(right)) {
            return validPalindromeHelper(s, left + 1, right - 1, deletionsAllowed);
        }
        if (deletionsAllowed == 0) return false;
        return validPalindromeHelper(s, left + 1, right, deletionsAllowed - 1) ||
               validPalindromeHelper(s, left, right - 1, deletionsAllowed - 1);
    }
} 