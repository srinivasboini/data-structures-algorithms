package com.dsa.strings.longestpalindromicsubstring;

/**
 * Dynamic Programming implementation of the Longest Palindromic Substring problem.
 * 
 * Approach:
 * - Create a 2D boolean DP table where dp[i][j] indicates whether the substring s[i...j] is a palindrome.
 * - Initialize all single characters to true because every single character is a palindrome.
 * - Check for two-character palindromes.
 * - For substrings longer than two, use the recurrence:
 *      dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i+1][j-1]
 * - Track the start index and maximum length of the longest palindromic substring encountered.
 * 
 * Time Complexity: O(n^2) - Every substring is examined.
 * Space Complexity: O(n^2) - 2D table is used to store palindrome information for all substrings.
 */
public class DynamicProgrammingApproach implements LongestPalindromicSubstringStrategy {

    /**
     * Finds the longest palindromic substring using dynamic programming.
     *
     * @param s The input string.
     * @return The longest palindromic substring found in s.
     */
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int n = s.length();
        // dp[i][j] is true if s[i...j] is a palindrome
        boolean[][] dp = new boolean[n][n];
        int startOfLongest = 0;
        int maxLength = 1; // Every single character is a palindrome
        
        // Initialize: Every single character is a palindrome
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                startOfLongest = i;
                maxLength = 2;
            }
        }
        
        // Check for substrings greater than length 2
        // l is the length of the substring
        for (int l = 3; l <= n; l++) {
            // i is the starting index of the substring
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1; // j is the ending index of the substring
                
                // s[i...j] is a palindrome if s.charAt(i) equals s.charAt(j)
                // and the substring s[i+1...j-1] is also a palindrome.
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    
                    // Update longest palindrome info if needed
                    if (l > maxLength) {
                        startOfLongest = i;
                        maxLength = l;
                    }
                }
            }
        }
        
        // Return the longest palindromic substring
        return s.substring(startOfLongest, startOfLongest + maxLength);
    }
} 