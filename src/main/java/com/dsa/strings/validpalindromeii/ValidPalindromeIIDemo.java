package com.dsa.strings.validpalindromeii;

public class ValidPalindromeIIDemo {
    public static void main(String[] args) {
        String s = "abca";
        
        ValidPalindromeIIStrategy bruteForce = new BruteForceApproach();
        ValidPalindromeIIStrategy twoPointer = new TwoPointerApproach();
        ValidPalindromeIIStrategy recursive = new RecursiveApproach();
        
        System.out.println("Brute Force Approach: " + bruteForce.validPalindrome(s));
        System.out.println("Two Pointer Approach: " + twoPointer.validPalindrome(s));
        System.out.println("Recursive Approach: " + recursive.validPalindrome(s));
    }
} 