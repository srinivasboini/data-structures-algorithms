package com.dsa.twopointers.removeelement;

public class RemoveElementDemo {
    public static void main(String[] args) {
        RemoveElementStrategy strategy = new OptimalApproach();
        
        // Test Case 1
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        printResult(nums1, val1, strategy);
        
        // Test Case 2
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        printResult(nums2, val2, strategy);
        
        // Test Case 3
        int[] nums3 = {2};
        int val3 = 3;
        printResult(nums3, val3, strategy);
    }

    private static void printResult(int[] nums, int val, RemoveElementStrategy strategy) {
        int[] copy = nums.clone();
        int newLength = strategy.removeElement(copy, val);
        
        System.out.println("Original array: " + arrayToString(nums));
        System.out.println("Value to remove: " + val);
        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + arrayToString(copy, newLength));
        System.out.println();
    }

    private static String arrayToString(int[] arr) {
        return arrayToString(arr, arr.length);
    }

    private static String arrayToString(int[] arr, int length) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);
            if (i < length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
} 