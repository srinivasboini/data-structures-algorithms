package com.dsa.twopointers.containerwithmostwater;

public class ContainerWithMostWaterDemo {
    public static void main(String[] args) {
        ContainerWithMostWaterStrategy strategy = new OptimalApproach();
        
        // Test Case 1
        int[] heights1 = {1,8,6,2,5,4,8,3,7};
        System.out.println("Test Case 1: " + strategy.maxArea(heights1));
        
        // Test Case 2
        int[] heights2 = {1,1};
        System.out.println("Test Case 2: " + strategy.maxArea(heights2));
        
        // Test Case 3
        int[] heights3 = {4,3,2,1,4};
        System.out.println("Test Case 3: " + strategy.maxArea(heights3));
    }
} 