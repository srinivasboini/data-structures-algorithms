# Subarray Sum Equals K

## Problem Statement
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check all possible subarrays
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)

### 2. Prefix Sum with HashMap (Optimal)
- **Algorithm**:
  1. Track cumulative sum frequencies
  2. Check for (currentSum - k) in map
  3. Update map with current sum
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)

## Key Insights
- Use hashmap to store prefix sum frequencies
- Mathematical relation: currentSum - target = previousSum
- Handles negative numbers and zeros naturally

## Common Mistakes
- Forgetting to initialize map with (0,1)
- Not handling multiple occurrences of same sum
- Incorrect count update order

## Learning Points
- Prefix sum pattern
- Hashmap frequency tracking
- Mathematical relation for subarray sums 