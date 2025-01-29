package com.dsa.strings.reversestring;

import java.util.Arrays;

public class ReverseStringDemo {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        
        ReverseStringStrategy bruteForce = new BruteForceApproach();
        ReverseStringStrategy twoPointer = new TwoPointerApproach();
        
        char[] s1 = Arrays.copyOf(s, s.length);
        char[] s2 = Arrays.copyOf(s, s.length);
        
        bruteForce.reverseString(s1);
        twoPointer.reverseString(s2);
        
        System.out.println("Brute Force Approach: " + Arrays.toString(s1));
        System.out.println("Two Pointer Approach: " + Arrays.toString(s2));
    }
} 