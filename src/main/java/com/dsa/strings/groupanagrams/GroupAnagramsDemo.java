package com.dsa.strings.groupanagrams;

import java.util.List;

public class GroupAnagramsDemo {
    public static void main(String[] args) {
        GroupAnagramsStrategy strategy = new CharacterCountApproach();
        
        String[][] testCases = {
            {"eat","tea","tan","ate","nat","bat"},
            {""},
            {"a"}
        };
        
        for (String[] testCase : testCases) {
            List<List<String>> result = strategy.groupAnagrams(testCase);
            System.out.println("Input: " + arrayToString(testCase));
            System.out.println("Grouped Anagrams:");
            result.forEach(group -> System.out.println("  " + group));
            System.out.println();
        }
    }
    
    private static String arrayToString(String[] arr) {
        return "[" + String.join(", ", arr) + "]";
    }
} 