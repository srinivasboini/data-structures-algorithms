package com.dsa.slidingwindow.findallanagrams;

import java.util.List;

public class FindAllAnagramsDemo {
    public static void main(String[] args) {
        FindAllAnagramsStrategy strategy = new SlidingWindowApproach();
        
        String[][] testCases = {
            {"cbaebabacd", "abc"},  // Expected [0,6]
            {"abab", "ab"},         // Expected [0,1,2]
            {"aaaaaaaaaa", "aaaaa"}// Expected [0,1,2,3,4,5]
        };
        
        for (String[] testCase : testCases) {
            String s = testCase[0];
            String p = testCase[1];
            List<Integer> result = strategy.findAnagrams(s, p);
            System.out.println("Input: s=\"" + s + "\", p=\"" + p + "\"");
            System.out.println("Anagram indices: " + result + "\n");
        }
    }
} 