package com.dsa.strings.longestpalindromicsubstring;

/**
 * Optimal implementation using center expansion technique to find the longest palindromic substring.
 * 
 * Approach:
 * 1. Iterate over each possible center in the string. Each character can be the center of an odd-length
 *    palindrome, and each pair of adjacent characters is the center of an even-length palindrome.
 * 2. Expand around each center as long as the characters on both sides match.
 * 3. Keep track of the current longest palindrome (by its starting and ending indices).
 * 
 * Time Complexity: O(n²) - For each character, we potentially expand in both directions.
 * Space Complexity: O(1) - Only a few integer variables are used.
 */
public class ExpandCenterApproach implements LongestPalindromicSubstringStrategy {

    /**
     * Finds the longest palindromic substring within the given string using center expansion technique.
     * 
     * @param s The input string.
     * @return The longest palindromic substring found in s.
     */
    @Override
    public String longestPalindrome(String s) {
        // Check if the input string is null or empty; return an empty string if so.
        if (s == null || s.length() < 1) return "";

        // Variables to store the starting and ending indices of the longest palindrome found so far.
        int startIndexOfLongest = 0;
        int endIndexOfLongest = 0;

        // Loop through each character in the string, considering each as a potential center.
        for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {
            // For odd-length palindromes, use the same index for left and right pointers.
            int lengthOdd = expandAroundCenter(s, currentIndex, currentIndex);
            // For even-length palindromes, use adjacent characters as the center.
            int lengthEven = expandAroundCenter(s, currentIndex, currentIndex + 1);

            // Determine the longer palindrome between odd and even length expansions.
            int currentMaxLength = Math.max(lengthOdd, lengthEven);

            // If the found palindrome is longer than the previously recorded one, update the indices.
            if (currentMaxLength > endIndexOfLongest - startIndexOfLongest) {
                // Calculate new start index based on the current center and palindrome length.
                startIndexOfLongest = currentIndex - (currentMaxLength - 1) / 2;
                // Calculate new end index based on the current center and palindrome length.
                endIndexOfLongest = currentIndex + currentMaxLength / 2;
            }
        }

        // Extract and return the longest palindromic substring using the stored indices.
        return s.substring(startIndexOfLongest, endIndexOfLongest + 1);
    }

    /**
     * Helper method to expand from the center and find the length of the palindrome.
     * 
     * The method uses two pointers starting at the given indices and moves them outward until the characters
     * at those pointers are not equal or the indices go out of bounds.
     *
     * @param s     The input string.
     * @param left  The starting left index for expansion.
     * @param right The starting right index for expansion.
     * @return The length of the palindromic substring found by expanding from the center.
     */
    private int expandAroundCenter(String s, int left, int right) {
        // Expand as long as the left pointer is non-negative, right pointer is within bounds,
        // and the corresponding characters are equal.
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // After the loop, left and right pointers are one step beyond the actual palindrome boundaries.
        // The palindrome length is calculated by subtracting the extra steps.
        return right - left - 1;
    }
} 