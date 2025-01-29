package com.dsa.strings.validanagram;

/**
 * Strategy interface for the Valid Anagram problem.
 */
public interface ValidAnagramStrategy {
    /**
     * Checks if two strings are anagrams of each other.
     *
     * @param s First input string.
     * @param t Second input string.
     * @return True if the strings are anagrams, false otherwise.
     */
    boolean isAnagram(String s, String t);
} 