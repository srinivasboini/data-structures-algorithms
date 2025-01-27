package com.dsa.arrays.twosum;

import com.dsa.utils.ArrayUtil;

/**
 * Demo class for testing different Two Sum implementations.
 * 
 * This class provides a set of test cases to demonstrate and verify
 * the functionality of different Two Sum approaches.
 * 
 * Test cases cover:
 * - Basic case with positive numbers
 * - Negative numbers
 * - Duplicate numbers
 * - No solution case
 * - Zero sum case
 */
public class TwoSumDemo {
    
    /**
     * Runs a set of predefined test cases for the given solution.
     *
     * @param solution the Two Sum implementation to test
     */
    public static void runTestCases(TwoSumStrategy solution) {
        // Test Case 1: Basic case
        testCase(solution, 
                new int[]{2, 7, 11, 15}, 9,
                "Basic Case");
        
        // Test Case 2: Negative numbers
        testCase(solution, 
                new int[]{-1, -2, -3, -4, -5}, -8,
                "Negative Numbers");
        
        // Test Case 3: Duplicate numbers
        testCase(solution, 
                new int[]{3, 3}, 6,
                "Duplicate Numbers");
        
        // Test Case 4: No solution
        testCase(solution, 
                new int[]{1, 2, 3, 4}, 10,
                "No Solution Case");
        
        // Test Case 5: Zero sum
        testCase(solution, 
                new int[]{0, 4, 3, 0}, 0,
                "Zero Sum Case");
    }
    
    /**
     * Helper method to run and display results for a single test case.
     *
     * @param solution the Two Sum implementation to test
     * @param nums input array for the test case
     * @param target target sum to find
     * @param caseName descriptive name of the test case
     */
    private static void testCase(TwoSumStrategy solution, int[] nums, int target, String caseName) {
        System.out.println("\nTest Case: " + caseName);
        System.out.println("Input Array: ");
        ArrayUtil.printArray(nums);
        System.out.println("Target: " + target);
        System.out.println("Result: ");
        ArrayUtil.printArray(solution.findTwoSum(nums, target));
    }
} 