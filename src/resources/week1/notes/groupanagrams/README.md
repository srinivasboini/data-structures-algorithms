# Group Anagrams

## Problem Statement
Given an array of strings strs, group the anagrams together.

## Approaches

### 1. Sorted Key Approach (Brute Force)
- **Algorithm**: 
  1. Sort each string to create a key
  2. Group strings by sorted key
- **Time Complexity**: O(n * k log k) (k = max string length)
- **Space Complexity**: O(n * k)

### 2. Character Count Approach (Optimal)
- **Algorithm**:
  1. Create frequency count array for each string
  2. Convert count array to string key
  3. Group by count key
- **Time Complexity**: O(n * k) (k = max string length)
- **Space Complexity**: O(n * k)

## Key Insights
- Anagrams have identical character frequencies
- Hash maps can efficiently group similar items
- Trade-off between sorting vs frequency counting

## Common Mistakes
- Forgetting to handle empty input
- Case sensitivity issues (problem states lowercase only)
- Incorrect key generation for frequency counts

## Learning Points
- String manipulation techniques
- Hash map grouping patterns
- Time-space complexity tradeoffs 