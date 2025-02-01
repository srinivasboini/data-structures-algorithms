package com.dsa.strings.longestpalindromicsubstring;

/**
 * Brute Force implementation for finding longest palindromic substring.
 * 
 * Approach:
 * 1. Generate all possible substrings
 * 2. Check each substring for palindrome property
 * 3. Track the longest palindrome found
 * 
 * Time Complexity: O(n³) - Three nested loops (two for substring generation, 
 * one for palindrome check)
 * Space Complexity: O(1) - Only stores the longest substring
 */
public class BruteForceApproach implements LongestPalindromicSubstringStrategy {
    
    /**
     * Finds the longest palindromic substring using brute force method
     * @param s Input string
     * @return Longest palindromic substring
     */
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        String longest = "";
        // Generate all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // Get current substring
                String substr = s.substring(i, j + 1);
                // Check if palindrome and longer than current longest
                if (isPalindrome(substr) && substr.length() > longest.length()) {
                    longest = substr;
                }
            }
        }
        return longest;
    }
    
    /**
     * Helper method to check if a string is palindrome
     * @param s String to check
     * @return true if palindrome, false otherwise
     */
    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        // Check characters from both ends moving towards center
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