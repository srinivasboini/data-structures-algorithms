package com.dsa.strings.validanagram;

/**
 * Array-based implementation of Valid Anagram problem.
 * 
 * Approach:
 * - Use an array to count the frequency of each character.
 * - Compare the frequency arrays for both strings.
 * 
 * Time Complexity: O(n) - Single pass to count characters.
 * Space Complexity: O(1) - Fixed size array for 26 characters.
 */
public class ArrayApproach implements ValidAnagramStrategy {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }
} 