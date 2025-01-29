package com.dsa.twopointers.containerwithmostwater;

/**
 * Interface for Container With Most Water problem.
 * 
 * Problem: Given an integer array height of length n, find two lines that together 
 * with the x-axis form a container, such that the container contains the most water.
 * 
 * Constraints:
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 * 
 * @see BruteForceApproach
 * @see OptimalApproach
 */
public interface ContainerWithMostWaterStrategy {
    int maxArea(int[] height);
} 