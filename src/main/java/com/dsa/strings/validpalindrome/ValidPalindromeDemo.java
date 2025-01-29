package com.dsa.strings.validpalindrome;

public class ValidPalindromeDemo {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        
        ValidPalindromeStrategy bruteForce = new BruteForceApproach();
        ValidPalindromeStrategy twoPointer = new TwoPointerApproach();
        
        System.out.println("Brute Force Approach: " + bruteForce.isPalindrome(s));
        System.out.println("Two Pointer Approach: " + twoPointer.isPalindrome(s));
    }
} 