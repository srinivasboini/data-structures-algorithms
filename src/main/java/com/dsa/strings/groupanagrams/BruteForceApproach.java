package com.dsa.strings.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteForceApproach implements GroupAnagramsStrategy {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] processed = new boolean[strs.length];
        
        for (int i = 0; i < strs.length; i++) {
            if (processed[i]) continue;
            
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            processed[i] = true;
            
            for (int j = i + 1; j < strs.length; j++) {
                if (!processed[j] && areAnagrams(strs[i], strs[j])) {
                    group.add(strs[j]);
                    processed[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }
    
    private boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
} 