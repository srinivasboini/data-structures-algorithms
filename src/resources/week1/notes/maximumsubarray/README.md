# Maximum Subarray - Comprehensive Analysis

## Problem Statement
Given an integer array nums, find the contiguous subarray (containing at least one number) with the largest sum.

## Constraints
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check all possible subarrays
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Pros**: Simple implementation
- **Cons**: Impractical for large arrays

### 2. Kadane's Algorithm (Optimal)
- **Algorithm**:
  1. Track current maximum subarray sum
  2. Update global maximum when current exceeds it
  3. Reset current sum when it becomes negative
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: Efficient single pass
- **Cons**: Requires understanding of dynamic programming

## Edge Cases
1. All negative numbers
2. Single element array
3. All positive numbers
4. Mix of positive and negative
5. Zero values in array

## Learning Points
- Dynamic programming principles
- Sliding window technique variation
- Handling negative numbers
- Space-time complexity tradeoffs

## Common Mistakes
- Forgetting to handle all-negative cases
- Initializing max values incorrectly
- Not resetting current sum properly
- Off-by-one errors in indices
- Missing single element case

## Interview Tips
1. Start with brute force explanation
2. Derive Kadane's algorithm through examples
3. Visualize the current sum tracking
4. Discuss handling negative numbers
5. Analyze time/space complexity

## Real-world Applications
- Stock market analysis
- Signal processing
- Computer vision
- Economic trend analysis
- Network traffic optimization

## Problem-Solving Thought Process
**Key insights for optimal approach:**
1. Current sum tracks maximum subarray ending at each position
2. Reset current sum when it becomes negative
3. Global sum tracks overall maximum
4. Single pass through array

**Why this works:**
- Avoids recomputing subarray sums
- Maintains O(n) time complexity
- Handles negative numbers correctly
- Efficiently tracks potential maximums 