package com.dsa.arrays.plusone;

import java.util.Arrays;

/**
 * Demo class for Plus One problem.
 * 
 * This class provides a set of test cases to demonstrate and verify
 * the functionality of different Plus One approaches.
 */
public class PlusOneDemo {

    public static void main(String[] args) {
        PlusOneStrategy strategy = new OptimalApproach();
        runTestCases(strategy);
    }
    
    public static void runTestCases(PlusOneStrategy strategy) {
        // Test Case 1: Simple increment
        testCase(strategy, new int[]{1, 2, 3}, "Simple Increment");
        
        // Test Case 2: Increment with carry
        testCase(strategy, new int[]{9, 9, 9}, "Increment with Carry");
        
        // Test Case 3: Single digit
        testCase(strategy, new int[]{9}, "Single Digit");
    }
    
    private static void testCase(PlusOneStrategy strategy, int[] digits, String caseName) {
        System.out.println("\nTest Case: " + caseName);
        System.out.println("Original Digits: " + Arrays.toString(digits));
        
        int[] result = strategy.plusOne(digits);
        
        System.out.println("Resulting Digits: " + Arrays.toString(result));
    }
} 