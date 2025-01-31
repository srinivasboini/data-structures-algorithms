package com.dsa.prefixsuffix.productofarrayexceptself;

public class ProductOfArrayDemo {
    public static void main(String[] args) {
        ProductOfArrayStrategy strategy = new PrefixSuffixApproach();
        
        int[][] testCases = {
            {1,2,3,4},       // [24,12,8,6]
            {0,1,2,3},       // [6,0,0,0]
            {-1,1,0,-3,3}    // [0,0,9,0,0]
        };
        
        for (int[] testCase : testCases) {
            int[] result = strategy.productExceptSelf(testCase);
            System.out.println("Input array: " + arrayToString(testCase));
            System.out.println("Result: " + arrayToString(result) + "\n");
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