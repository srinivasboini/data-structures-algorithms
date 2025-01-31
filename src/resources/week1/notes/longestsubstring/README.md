# Longest Substring Without Repeating Characters

## Problem Statement
Given a string `s`, find the length of the longest substring without repeating characters.

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check all possible substrings
- **Time Complexity**: O(n²)
- **Space Complexity**: O(min(n, m)) where m is character set size

### 2. Sliding Window with HashSet
- **Algorithm**:
  1. Maintain window with unique characters
  2. Expand right until duplicate found
  3. Shrink left until duplicates removed
- **Time Complexity**: O(n)
- **Space Complexity**: O(min(n, m))

## Key Insights
- Use HashSet for O(1) lookups
- Maintain window boundaries with left/right pointers
- Update maximum length during window expansion

## Common Mistakes
- Forgetting to update left pointer correctly
- Not handling empty string case
- Incorrect window size calculation

## Learning Points
- Sliding window pattern for substring problems
- Tradeoffs between time and space complexity
- Character frequency tracking techniques 