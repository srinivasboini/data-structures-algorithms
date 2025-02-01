package com.dsa.strings.longestpalindromicsubstring;

/**
 * Manacher's Algorithm implementation of the Longest Palindromic Substring problem.
 * 
 * Approach:
 * 1. Transform the input string by inserting special characters (e.g., '#') between each letter and at the boundaries.
 *    This allows even-length palindromes to be treated uniformly with odd-length ones.
 * 2. Use a radius array (p[]) to store the maximum length of the palindrome around each character in the transformed string.
 * 3. Maintain a current center and right boundary which represent the farthest-reaching palindrome found so far.
 * 4. For each new index, mirror its palindrome length from its symmetric counterpart relative to the current center.
 * 5. Expand around the current index if needed, then update the center and right boundary.
 * 6. After processing, determine the maximum radius and convert the position back to the original string index.
 * 
 * Time Complexity: O(n) - Each character is processed only once with mirroring optimization.
 * Space Complexity: O(n) - Additional space for the transformed string and the radius array.
 */
public class ManacherApproach implements LongestPalindromicSubstringStrategy {

    /**
     * Finds the longest palindromic substring using Manacher's Algorithm.
     *
     * @param s The input string.
     * @return The longest palindromic substring found in s.
     */
    @Override
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        // Transform s into a new string t with sentinels.
        // For example, "abba" becomes "^#a#b#b#a#$" to handle even-length cases uniformly.
        String t = preprocess(s);
        int n = t.length();
        int[] p = new int[n]; // Array to store the lengths (radius) of palindromes around each center.
        int center = 0, right = 0;
        
        // Iterate over transformed string (skip the sentinels)
        for (int i = 1; i < n - 1; i++) {
            // Mirror index of i with respect to the current center.
            int mirror = 2 * center - i;
            
            // If i is within the current right boundary, minimize the value.
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            
            // Expand the palindrome centered at i.
            while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {
                p[i]++;
            }
            
            // If the palindrome centered at i expands past right,
            // update the center and right boundary.
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }
        
        // Find the index of the maximum palindrome radius.
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        
        // Convert the index in the transformed string back to the original string's indices.
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
    
    /**
     * Preprocesses the input string by inserting '#' between characters and adding boundary markers.
     *
     * @param s The original input string.
     * @return The transformed string with inserted characters and sentinels.
     */
    private String preprocess(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("^"); // Starting sentinel to avoid bounds checking.
        for (int i = 0; i < s.length(); i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#$"); // Ending sentinel.
        return sb.toString();
    }
} 