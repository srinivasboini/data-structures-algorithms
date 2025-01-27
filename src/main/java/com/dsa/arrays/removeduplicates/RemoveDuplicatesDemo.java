package com.dsa.arrays.removeduplicates;

import com.dsa.utils.ArrayUtil;

/**
 * Demo class for testing Remove Duplicates from Sorted Array implementations.
 * 
 * This class provides a set of test cases to demonstrate and verify
 * the functionality of different Remove Duplicates approaches.
 * 
 * Test cases cover:
 * - Basic case with few duplicates
 * - Array with multiple duplicates
 * - Array with no duplicates
 * - Array with all duplicates
 * - Empty array
 * - Single element array
 */
public class RemoveDuplicatesDemo {
    
    public static void runTestCases(RemoveDuplicatesStrategy solution) {
        // Test Case 1: Basic case
        testCase(solution, 
                new int[]{1, 1, 2},
                "Basic Case");
        
        // Test Case 2: Multiple duplicates
        testCase(solution, 
                new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
                "Multiple Duplicates");
        
        // Test Case 3: No duplicates
        testCase(solution, 
                new int[]{1, 2, 3, 4, 5},
                "No Duplicates");
        
        // Test Case 4: All duplicates
        testCase(solution, 
                new int[]{1, 1, 1, 1, 1},
                "All Duplicates");
        
        // Test Case 5: Single element
        testCase(solution, 
                new int[]{1},
                "Single Element");
    }
    
    private static void testCase(RemoveDuplicatesStrategy solution, int[] nums, String caseName) {
        System.out.println("\nTest Case: " + caseName);
        System.out.println("Original Array: ");
        ArrayUtil.printArray(nums);
        
        int length = solution.removeDuplicates(nums);
        
        System.out.println("After removing duplicates (length = " + length + "): ");
        ArrayUtil.printArray(nums, length);
    }
} 