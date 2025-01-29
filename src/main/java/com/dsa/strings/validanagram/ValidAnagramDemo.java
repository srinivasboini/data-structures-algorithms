package com.dsa.strings.validanagram;

public class ValidAnagramDemo {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        ValidAnagramStrategy bruteForce = new BruteForceApproach();
        ValidAnagramStrategy sorting = new SortingApproach();
        
        System.out.println("Brute Force Approach: " + bruteForce.isAnagram(s, t));
        System.out.println("Sorting Approach: " + sorting.isAnagram(s, t));
    }
} 