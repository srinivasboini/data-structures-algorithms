package com.dsa.prefixsuffix.productofarrayexceptself;

public class PrefixSuffixApproach implements ProductOfArrayStrategy {
    @Override
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate prefix products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        
        // Calculate suffix products and combine
        int suffix = 1;
        for (int i = n-1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        
        return result;
    }
} 