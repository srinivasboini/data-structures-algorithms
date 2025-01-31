# Product of Array Except Self

## Problem Statement
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

## Approaches

### 1. Brute Force Approach
- **Algorithm**: For each element, calculate product of all other elements
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1) (excluding output array)

### 2. Prefix/Suffix Approach
- **Algorithm**:
  1. Calculate prefix products (products to the left)
  2. Calculate suffix products (products to the right)
  3. Combine prefix and suffix products
- **Time Complexity**: O(n)
- **Space Complexity**: O(1) (excluding output array)

## Key Insights
- Avoid division operator (problem constraint)
- Use output array for intermediate calculations
- Combine prefix and suffix in single pass

## Common Mistakes
- Forgetting to handle zero values
- Incorrect prefix/suffix initialization
- Not maintaining O(1) space complexity

## Learning Points
- Prefix product pattern
- Space optimization techniques
- Handling edge cases with zeros 