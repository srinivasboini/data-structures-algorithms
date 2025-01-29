package com.dsa.strings.validanagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Brute force implementation of Valid Anagram problem.
 * 
 * Approach:
 * - Count the frequency of each character in both strings.
 * - Compare the frequency maps for equality.
 * 
 * Time Complexity: O(n) - Single pass to count characters.
 * Space Complexity: O(1) - Limited to 26 characters in the alphabet.
 */
public class BruteForceApproach implements ValidAnagramStrategy {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }
        
        return true;
    }
} 