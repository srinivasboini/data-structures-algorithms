package com.dsa.twopointers.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Optimal implementation of 3Sum problem using sorting and two pointers.
 * 
 * Approach:
 * 1. Sort the array
 * 2. Iterate through each element as first element
 * 3. Use two pointers for remaining elements
 * 4. Skip duplicates to avoid repeated triplets
 * 
 * Time Complexity: O(n²)
 * Space Complexity: O(1) (excluding output storage)
 */
public class OptimalApproach implements ThreeSumStrategy {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate starting elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1, right = nums.length - 1;
            int target = -nums[i];
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
} 