package com.dsa.strings.validpalindrome;

/**
 * Brute force implementation of Valid Palindrome problem.
 * 
 * Approach:
 * - Clean the string by removing non-alphanumeric characters and converting to lowercase.
 * - Check if the cleaned string is equal to its reverse.
 * 
 * Time Complexity: O(n) - Single pass to clean and another to check palindrome.
 * Space Complexity: O(n) - Additional space for the cleaned string.
 */
public class BruteForceApproach implements ValidPalindromeStrategy {
    @Override
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String cleanedStr = cleaned.toString();
        return cleanedStr.equals(cleaned.reverse().toString());
    }
} 