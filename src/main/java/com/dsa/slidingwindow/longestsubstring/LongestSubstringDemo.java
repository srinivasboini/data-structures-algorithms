package com.dsa.slidingwindow.longestsubstring;

public class LongestSubstringDemo {
    public static void main(String[] args) {
        LongestSubstringStrategy strategy = new SlidingWindowApproach();
        
        String[] testCases = {
            "abcabcbb",  // Expected 3
            "bbbbb",     // Expected 1
            "pwwkew",    // Expected 3
            null,        // Expected 0
            "",          // Expected 0
            "ab",        // Expected 2
            "a b c"      // Expected 3 (with spaces)
        };
        
        for (String testCase : testCases) {
            int result = strategy.lengthOfLongestSubstring(testCase);
            System.out.println("Input: \"" + testCase + "\"");
            System.out.println("Longest substring length: " + result + "\n");
        }
    }
} 