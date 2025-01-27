package com.dsa.arrays.twosum;

import java.util.HashMap;
import java.util.Map;
import com.dsa.utils.ArrayUtil;

/**
 * HashMap-based implementation of Two Sum problem.
 * 
 * Approach:
 * - Use HashMap to store complement values
 * - For each number x, check if (target - x) exists in map
 * - If found, we have our pair
 * - If not, add current number to map
 * 
 * Time Complexity: O(n) - where n is the length of input array
 * - Single pass through the array
 * - HashMap operations are O(1) average case
 * 
 * Space Complexity: O(n)
 * - HashMap can store up to n elements in worst case
 * 
 * @see TwoSumStrategy
 */
public class HashMapApproach implements TwoSumStrategy {
    
    /**
     * Finds two numbers that sum to target using HashMap approach.
     * 
     * @param nums the input array of integers
     * @param target the target sum to find
     * @return array of two indices whose corresponding values sum to target
     * @throws IllegalArgumentException if nums is null or has length less than 2
     */
    @Override
    public int[] findTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must contain at least 2 elements");
        }
        
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }

    /**
     * Demonstrates the HashMap approach with various test cases.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        HashMapApproach solution = new HashMapApproach();
        System.out.println("HashMap Approach Demo:");
        TwoSumDemo.runTestCases(solution);
    }
} 