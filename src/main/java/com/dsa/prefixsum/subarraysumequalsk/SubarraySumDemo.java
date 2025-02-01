package com.dsa.prefixsum.subarraysumequalsk;

public class SubarraySumDemo {
    public static void main(String[] args) {
        SubarraySumStrategy strategy = new PrefixSumHashMapApproach();
        
        int[][] testCases = {
            {1,1,1},          // k=2 → 2
            {3,4,7,2,-3,1,4,2}, // k=7 → 4
            {0,0,0,0,0}       // k=0 → 15
        };
        
        for (int[] nums : testCases) {
            int k = (nums == testCases[2]) ? 0 : 7;
            if (nums == testCases[0]) k = 2;
            int result = strategy.subarraySum(nums, k);
            System.out.println("Array: " + arrayToString(nums));
            System.out.println("k = " + k + " → " + result + " subarrays\n");
        }
    }
    
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        return sb.append("]").toString();
    }
} 