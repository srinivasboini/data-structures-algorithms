# Reverse String

## Problem Statement
Write a function that reverses a string. The input string is given as an array of characters `s`.

## Constraints
- 1 <= s.length <= 10^5
- The input array is mutable.

## Approaches

### Brute Force Approach
- **Algorithm**: Use an additional array to store the reversed string.
- **Time Complexity**: O(n)
- **Space Complexity**: O(n)
- **Pros**: Simple to implement.
- **Cons**: Uses additional space.

### Two Pointer Approach
- **Algorithm**: Use two pointers to swap characters from the start and end.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: In-place reversal, efficient.
- **Cons**: None significant.

## Edge Cases
- Single character array, no change needed.
- Even and odd length arrays.

## Learning Points
- Understanding of in-place array manipulation.
- Efficient use of two pointers.

## Common Mistakes
- Forgetting to handle edge cases like single character arrays.

## Interview Tips
- Discuss both approaches and their trade-offs.
- Explain the benefits of in-place operations. 