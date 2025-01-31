# Find All Anagrams in a String

## Problem Statement
Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`.

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check all possible substrings of length p.length()
- **Time Complexity**: O(n*k) where n = s.length(), k = p.length()
- **Space Complexity**: O(1) (fixed-size frequency arrays)

### 2. Sliding Window Approach
- **Algorithm**:
  1. Maintain fixed-size window equal to p's length
  2. Use frequency arrays for comparison
  3. Slide window while updating counts
- **Time Complexity**: O(n)
- **Space Complexity**: O(1) (fixed-size arrays)

## Key Insights
- Fixed window size (length of p)
- Frequency array comparison is efficient
- Sliding window reduces redundant calculations

## Common Mistakes
- Forgetting to handle edge cases where p is longer than s
- Incorrect window size management
- Not resetting frequency arrays properly

## Learning Points
- Fixed-size sliding window pattern
- Frequency counting technique
- Efficient anagram checking 