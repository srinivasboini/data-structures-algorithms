package com.dsa.strings.validpalindromeii;

/**
 * Strategy interface for the Valid Palindrome II problem.
 */
public interface ValidPalindromeIIStrategy {
    /**
     * Checks if the input string can be a palindrome by removing at most one character.
     *
     * @param s Input string to be checked.
     * @return True if the string can be a palindrome, false otherwise.
     */
    boolean validPalindrome(String s);
} 