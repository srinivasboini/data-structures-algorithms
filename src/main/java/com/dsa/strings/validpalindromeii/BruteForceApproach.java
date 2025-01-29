package com.dsa.strings.validpalindromeii;

/**
 * Brute force implementation of Valid Palindrome II problem.
 * 
 * Approach:
 * - Try removing each character and check if the resulting string is a palindrome.
 * 
 * Time Complexity: O(n^2) - For each character, check if the string is a palindrome.
 * Space Complexity: O(n) - Space for the substring.
 */
public class BruteForceApproach implements ValidPalindromeIIStrategy {
    @Override
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPalindrome(String s, int skipIndex) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (left == skipIndex) left++;
            if (right == skipIndex) right--;
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
} 