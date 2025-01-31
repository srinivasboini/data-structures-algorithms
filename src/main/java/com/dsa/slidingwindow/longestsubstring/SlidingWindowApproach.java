package com.dsa.slidingwindow.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowApproach implements LongestSubstringStrategy {
    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        Set<Character> window = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            
            while (window.contains(current)) {
                window.remove(s.charAt(left));
                left++;
            }
            
            window.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
} 