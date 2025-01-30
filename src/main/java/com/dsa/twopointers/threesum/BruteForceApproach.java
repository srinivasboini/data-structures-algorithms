package com.dsa.twopointers.threesum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Brute Force implementation of 3Sum problem.
 * 
 * Approach:
 * - Check all possible triplets
 * - Use Set to avoid duplicates
 * 
 * Time Complexity: O(n³) - All triplets checked
 * Space Complexity: O(n) - For storing unique triplets
 */
public class BruteForceApproach implements ThreeSumStrategy {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        triplet.sort(null);
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
} 