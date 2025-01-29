package com.dsa.strings.firstuniquecharacter;

public class FirstUniqueCharacterDemo {
    public static void main(String[] args) {
        String s = "leetcode";
        
        FirstUniqueCharacterStrategy bruteForce = new BruteForceApproach();
        FirstUniqueCharacterStrategy hashMap = new HashMapApproach();
        
        System.out.println("Brute Force Approach: " + bruteForce.firstUniqChar(s));
        System.out.println("HashMap Approach: " + hashMap.firstUniqChar(s));
    }
} 