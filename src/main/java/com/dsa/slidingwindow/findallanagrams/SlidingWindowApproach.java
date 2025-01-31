package com.dsa.slidingwindow.findallanagrams;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowApproach implements FindAllAnagramsStrategy {
    @Override
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) return result;
        
        int[] count = new int[26];
        for (char c : p.toCharArray()) count[c - 'a']++;
        
        int left = 0, right = 0, pLen = p.length();
        int[] window = new int[26];
        
        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;
            
            if (right - left + 1 == pLen) {
                if (matches(count, window)) {
                    result.add(left);
                }
                window[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return result;
    }
    
    private boolean matches(int[] expected, int[] actual) {
        for (int i = 0; i < 26; i++) {
            if (expected[i] != actual[i]) return false;
        }
        return true;
    }
} 