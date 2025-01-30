package com.dsa.twopointers.threesum;

import java.util.List;

public class ThreeSumDemo {
    public static void main(String[] args) {
        ThreeSumStrategy strategy = new OptimalApproach();
        
        // Test Case 1
        int[] nums1 = {-1,0,1,2,-1,-4};
        printResult("Test Case 1:", strategy.threeSum(nums1));
        
        // Test Case 2
        int[] nums2 = {0,0,0,0};
        printResult("Test Case 2:", strategy.threeSum(nums2));
        
        // Test Case 3
        int[] nums3 = {-2,0,1,1,2};
        printResult("Test Case 3:", strategy.threeSum(nums3));
    }

    private static void printResult(String label, List<List<Integer>> result) {
        System.out.println(label);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
        System.out.println();
    }
} 