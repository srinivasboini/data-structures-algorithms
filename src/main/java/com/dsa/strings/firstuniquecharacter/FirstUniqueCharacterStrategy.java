package com.dsa.strings.firstuniquecharacter;

/**
 * Strategy interface for the First Unique Character in a String problem.
 */
public interface FirstUniqueCharacterStrategy {
    /**
     * Finds the index of the first non-repeating character in the string.
     *
     * @param s Input string to be checked.
     * @return Index of the first unique character, or -1 if none exists.
     */
    int firstUniqChar(String s);
} 