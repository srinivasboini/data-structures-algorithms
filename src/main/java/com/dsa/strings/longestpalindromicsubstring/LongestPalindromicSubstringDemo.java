package com.dsa.strings.longestpalindromicsubstring;

public class LongestPalindromicSubstringDemo {
    public static void main(String[] args) {
        LongestPalindromicSubstringStrategy strategy = new ExpandCenterApproach();
        
        String[] testCases = {
            "babad",
            "cbbd",
            "a",
            "ac",
            "racecar"
        };
        
        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\"");
            System.out.println("Longest Palindrome: \"" + 
                strategy.longestPalindrome(testCase) + "\"");
            System.out.println();
        }
    }
} 