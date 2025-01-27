# Two Sum - Problem Analysis

## Problem Understanding
- Input: Array of integers (nums) and a target integer
- Output: Indices of two numbers that add up to target
- Constraints:
  - Exactly one solution exists
  - Same element cannot be used twice
  - Return indices in any order

## Approach 1: Brute Force
- Time Complexity: O(n²)
- Space Complexity: O(1)
- Use nested loops to check each pair of numbers
- Not optimal for large inputs

## Approach 2: HashMap (Optimal)
- Time Complexity: O(n)
- Space Complexity: O(n)
- Single pass solution using HashMap
- Store complements for quick lookup

### Algorithm Steps:
1. Create HashMap to store number->index mapping
2. For each number:
   - Calculate complement (target - current number)
   - Check if complement exists in HashMap
   - If found, return current index and complement's index
   - If not, add current number and index to HashMap

## Edge Cases to Consider
- Empty array
- Array with two elements
- Negative numbers
- Duplicate numbers
- No solution exists

## Learning Points
- HashMap provides O(1) lookup
- Space-time trade-off
- Importance of complement calculation
- Single pass vs multiple pass solutions 