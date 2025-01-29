package com.dsa.strings.validpalindrome;

/**
 * Strategy interface for the Valid Palindrome problem.
 */
public interface ValidPalindromeStrategy {
    /**
     * Checks if the input string is a valid palindrome.
     *
     * @param s Input string to be checked.
     * @return True if the string is a valid palindrome, false otherwise.
     */
    boolean isPalindrome(String s);
} 