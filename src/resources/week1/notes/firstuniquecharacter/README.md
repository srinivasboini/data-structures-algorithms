# First Unique Character in a String

## Problem Statement
Given a string `s`, find the first non-repeating character and return its index. If it does not exist, return -1.

## Constraints
- 1 <= s.length <= 10^5
- The string contains only lowercase English letters.

## Approaches

### Brute Force Approach
- **Algorithm**: For each character, check if it appears only once.
- **Time Complexity**: O(n^2)
- **Space Complexity**: O(1)
- **Pros**: Simple to implement.
- **Cons**: Inefficient for large strings.

### HashMap Approach
- **Algorithm**: Use a HashMap to count occurrences and find the first unique character.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: Efficient, handles large strings well.
- **Cons**: Slightly more complex due to HashMap usage.

### Array Approach
- **Algorithm**: Use an array to count occurrences and find the first unique character.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: Simple and efficient for lowercase English letters.
- **Cons**: Limited to lowercase English letters.

## Edge Cases
- All characters are repeating, return -1.
- The first character is unique.

## Learning Points
- Understanding of character counting and HashMap usage.
- Efficient string traversal techniques.

## Common Mistakes
- Not handling strings with all repeating characters.
- Incorrectly counting character occurrences.

## Interview Tips
- Discuss both approaches and their trade-offs.
- Explain the benefits of using a HashMap for counting. 