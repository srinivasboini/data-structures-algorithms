# Two Sum - Comprehensive Problem Analysis

## Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of two numbers in the array such that they add up to `target`.

## Constraints
- Each input has exactly one solution
- Cannot use the same element twice
- Return the answer in any order
- Array length range: [2, 10^4]
- Number range: [-10^9, 10^9]
- Target range: [-10^9, 10^9]

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check every possible pair of numbers
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Pros**: Simple to implement, no extra space needed
- **Cons**: Slow for large inputs
- **Use Case**: Small arrays, interview demonstrations

### 2. HashMap Approach
- **Algorithm**: Store complements in HashMap for O(1) lookup
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)
- **Pros**: Optimal time complexity, single pass
- **Cons**: Uses extra space
- **Use Case**: Large arrays, production code

### 3. Two Pointer Approach
- **Algorithm**: Sort array and use two pointers
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(1)
- **Pros**: Space efficient
- **Cons**: Requires sorting, modifies input array
- **Use Case**: Space-constrained environments

## Edge Cases
1. Empty array
2. Array with two elements
3. Negative numbers
4. Duplicate numbers
5. No solution exists
6. Zero sum target
7. Overflow considerations

## Learning Points
1. Hash table usage for optimization
2. Space-time trade-offs
3. Two pointer technique
4. Input validation
5. Edge case handling
6. Multiple solution approaches

## Common Mistakes
1. Not handling edge cases
2. Forgetting about duplicates
3. Using same element twice
4. Not considering negative numbers
5. Assuming sorted input

## Interview Tips
1. Start with brute force approach
2. Optimize using HashMap
3. Discuss space-time trade-offs
4. Consider constraints
5. Test with edge cases 