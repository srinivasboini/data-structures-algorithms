package com.dsa.strings.validanagram;

import java.util.Arrays;

/**
 * Sorting implementation of Valid Anagram problem.
 * 
 * Approach:
 * - Sort both strings and compare them for equality.
 * 
 * Time Complexity: O(n log n) - Due to sorting.
 * Space Complexity: O(n) - Space for sorted arrays.
 */
public class SortingApproach implements ValidAnagramStrategy {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }
} 