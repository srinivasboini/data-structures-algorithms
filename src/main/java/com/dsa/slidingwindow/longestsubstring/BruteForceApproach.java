package com.dsa.slidingwindow.longestsubstring;

import java.util.HashSet;

public class BruteForceApproach implements LongestSubstringStrategy {
    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> seen = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char current = s.charAt(j);
                if (seen.contains(current)) break;
                seen.add(current);
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        
        return maxLength;
    }
} 