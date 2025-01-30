package com.dsa.slidingwindow.maximumsubarray;

public class MaximumSubarrayDemo {
    public static void main(String[] args) {
        MaximumSubarrayStrategy strategy = new KadaneApproach();
        
        // Test Case 1
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        printResult(nums1, strategy);
        
        // Test Case 2
        int[] nums2 = {-3,-2,-1,-4};
        printResult(nums2, strategy);
        
        // Test Case 3
        int[] nums3 = {5};
        printResult(nums3, strategy);
    }

    private static void printResult(int[] nums, MaximumSubarrayStrategy strategy) {
        System.out.println("Input array: " + arrayToString(nums));
        int result = strategy.maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result + "\n");
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
} 