package com.dsa.strings.firstuniquecharacter;

/**
 * Array-based implementation of First Unique Character in a String problem.
 * 
 * Approach:
 * - Use an array to count occurrences of each character.
 * - Iterate through the string to find the first character with a count of one.
 * 
 * Time Complexity: O(n) - Two passes through the string.
 * Space Complexity: O(1) - Fixed size array for 26 characters.
 */
public class ArrayApproach implements FirstUniqueCharacterStrategy {
    @Override
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // Array to store frequency of each character

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            // Subtract 'a' to get the index in the range 0-25
            // 'a' - 'a' = 0, 'b' - 'a' = 1, ..., 'z' - 'a' = 25
            freq[c - 'a']++;
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            // Check if the character at index i is unique
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1; // Return -1 if no unique character is found
    }
} 