package com.dsa.prefixsum.subarraysumequalsk;

import java.util.HashMap;
import java.util.Map;

public class PrefixSumHashMapApproach implements SubarraySumStrategy {
    @Override
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: sum 0 occurs once
        int count = 0, currentSum = 0;

    
        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            int complement = currentSum - k;
            count += prefixSumCount.getOrDefault(complement, 0);
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
       
        return count;
    }
} 