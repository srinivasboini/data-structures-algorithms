package com.dsa.slidingwindow.findallanagrams;

import java.util.ArrayList;
import java.util.List;

public class BruteForceApproach implements FindAllAnagramsStrategy {
    @Override
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) return result;
        
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) pCount[c - 'a']++;
        
        int pLen = p.length();
        for (int i = 0; i <= s.length() - pLen; i++) {
            int[] sCount = new int[26];
            for (int j = i; j < i + pLen; j++) {
                sCount[s.charAt(j) - 'a']++;
            }
            if (matches(pCount, sCount)) {
                result.add(i);
            }
        }
        return result;
    }
    
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
} 