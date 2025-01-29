# Valid Anagram

## Problem Statement
Given two strings `s` and `t`, return true if `t` is an anagram of `s`, and false otherwise.

## Constraints
- 1 <= s.length, t.length <= 5 * 10^4
- `s` and `t` consist of lowercase English letters.

## Approaches

### Brute Force Approach
- **Algorithm**: Count the frequency of each character and compare.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: Efficient for small character sets.
- **Cons**: More complex due to map usage.

### Sorting Approach
- **Algorithm**: Sort both strings and compare.
- **Time Complexity**: O(n log n)
- **Space Complexity**: O(n)
- **Pros**: Simple to implement.
- **Cons**: Less efficient due to sorting.

## Edge Cases
- Different lengths, immediately return false.
- Identical strings, return true.

## Learning Points
- Understanding of character counting and sorting.
- Efficient string comparison techniques.

## Common Mistakes
- Not handling different lengths early.
- Incorrectly counting character occurrences.

## Interview Tips
- Discuss both approaches and their trade-offs.
- Explain the benefits of using sorting for comparison. 