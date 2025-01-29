package com.dsa.twopointers.containerwithmostwater;

/**
 * Brute Force implementation of Container With Most Water problem.
 * 
 * Approach:
 * - Check all possible pairs of lines
 * - Calculate area for each pair
 * - Track maximum area found
 * 
 * Time Complexity: O(n²) - All pairs checked
 * Space Complexity: O(1) - No extra space used
 */
public class BruteForceApproach implements ContainerWithMostWaterStrategy {
    @Override
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, currentArea);
            }
        }
        return max;
    }
} 