# Remove Duplicates from Sorted Array - Comprehensive Problem Analysis

## Problem Statement
Given a sorted array `nums`, remove the duplicates in-place such that each element appears only once and return the new length. The relative order of the elements should be kept the same.

## Constraints
- Array is sorted in non-decreasing order
- Modify array in-place with O(1) extra memory
- Array length range: [0, 3 * 10^4]
- Number range: [-100, 100]
- Return k after placing the final result in the first k slots of nums

## Approaches

### 1. Brute Force Approach
- **Algorithm**: For each element, shift remaining elements left when duplicate found
- **Time Complexity**: O(n²)
  - Outer loop: n iterations
  - Inner loop: Up to n shifts for each duplicate
- **Space Complexity**: O(1)
- **Pros**: Simple to understand and implement
- **Cons**: Inefficient for large arrays
- **Use Case**: Small arrays, learning purposes

### 2. Two Pointer Approach (Optimal)
- **Algorithm**: Use two pointers (slow and fast) to track unique elements
- **Time Complexity**: O(n)
  - Single pass through the array
- **Space Complexity**: O(1)
- **Pros**: 
  - Optimal time complexity
  - In-place modification
  - Single pass solution
- **Cons**: Requires sorted input
- **Use Case**: Production code, large arrays

## Edge Cases
1. Empty array
2. Array with single element
3. Array with all duplicates
4. Array with no duplicates
5. Array with negative numbers
6. Array with maximum length
7. Array with consecutive duplicates
8. Array with non-consecutive duplicates

## Learning Points
1. Two pointer technique
2. In-place array modification
3. Handling sorted array properties
4. Space optimization
5. Input validation
6. Edge case handling

## Common Mistakes
1. Not handling null input
2. Incorrect length calculation
3. Not preserving order
4. Unnecessary array copying
5. Not utilizing sorted property
6. Incorrect pointer movement

## Interview Tips
1. Clarify input constraints
2. Discuss in-place requirement
3. Mention sorted array advantage
4. Explain two pointer approach
5. Analyze space-time trade-offs
6. Consider edge cases
7. Test with examples

## Real-world Applications
1. Data deduplication
2. Database record cleanup
3. Sensor data processing
4. Log file optimization
5. Memory optimization in systems 