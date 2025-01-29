package com.dsa.strings.firstuniquecharacter;

/**
 * Brute force implementation of First Unique Character in a String problem.
 * 
 * Approach:
 * - For each character, check if it appears only once in the string.
 * 
 * Time Complexity: O(n^2) - Nested loop for each character.
 * Space Complexity: O(1) - No additional data structures used.
 */
public class BruteForceApproach implements FirstUniqueCharacterStrategy {
    @Override
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                return i;
            }
        }
        return -1;
    }
} 