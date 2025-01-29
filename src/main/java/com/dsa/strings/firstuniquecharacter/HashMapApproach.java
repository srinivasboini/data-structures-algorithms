package com.dsa.strings.firstuniquecharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap implementation of First Unique Character in a String problem.
 * 
 * Approach:
 * - Use a HashMap to count occurrences of each character.
 * - Iterate through the string to find the first character with a count of one.
 * 
 * Time Complexity: O(n) - Two passes through the string.
 * Space Complexity: O(1) - Limited to 26 characters in the alphabet.
 */
public class HashMapApproach implements FirstUniqueCharacterStrategy {
    @Override
    public int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
} 