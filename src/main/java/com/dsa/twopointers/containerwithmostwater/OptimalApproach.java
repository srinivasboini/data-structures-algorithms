package com.dsa.twopointers.containerwithmostwater;

/**
 * Optimal implementation of Container With Most Water problem using Two Pointer approach.
 * 
 * Approach:
 * - Start with pointers at both ends
 * - Move pointer with smaller height inward
 * - Track maximum area during iteration
 * 
 * Time Complexity: O(n) - Single pass
 * Space Complexity: O(1) - Constant space
 */
public class OptimalApproach implements ContainerWithMostWaterStrategy {
    @Override
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
} 