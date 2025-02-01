# Longest Palindromic Substring

## Problem Analysis
A palindrome is a string that reads the same forward and backward. The challenge is to find the longest such substring in a given string.

**Example:**
Input: "babad"  
Output: "bab" or "aba"

## Approach Comparison

### 1. Brute Force Approach
**Steps:**
1. Generate all possible substrings
2. Check each substring for palindrome property
3. Track the longest valid palindrome

**Complexity Analysis:**
- Time: O(n³) - Three nested operations
- Space: O(1)

**Use Case:**
- Small strings (n < 100)
- Educational purposes to understand palindrome properties

### 2. Expand Around Center (Optimal)
**Steps:**
1. Iterate through each character as potential center
2. Check both odd-length (single center) and even-length (dual center) palindromes
3. Expand from center while characters match
4. Track maximum length found

**Complexity Analysis:**
- Time: O(n²) - Two expansions per character
- Space: O(1)

**Use Case:**
- Large strings (n up to 10^3-10^4)
- Production-grade solutions

## Step-by-Step Example
**Input:** "cbbd"

**Optimal Approach Execution:**
1. i=0 (character 'c')
   - Odd expansion: "c" (length 1)
   - Even expansion: no match (c != b)
2. i=1 (character 'b')
   - Odd expansion: "b" → "bb" (length 2)
   - Even expansion: "bb" (length 2)
3. i=2 (character 'b')
   - Odd expansion: "b" → "b" (length 1)
   - Even expansion: no match (b != d)
4. i=3 (character 'd')
   - Odd expansion: "d" (length 1)
   - Even expansion: out of bounds

**Longest found:** "bb"

## Common Pitfalls
1. **Index Calculation Errors:**
   - Incorrect start/end calculation during expansion
   - Solution: Use (len - 1) / 2 for start offset

2. **Edge Case Handling:**
   - Empty string
   - Single character strings
   - All unique characters

3. **Even/Odd Length Assumption:**
   - Forgetting to check both cases
   - Solution: Always check both expansion types

## Learning Outcomes
1. **Palindrome Properties:**
   - Symmetrical around center
   - Can have single or dual centers

2. **Algorithm Optimization:**
   - Reducing time complexity through smart iteration
   - Leveraging string properties to avoid redundant checks

3. **Problem Solving Strategy:**
   - Start with brute force to understand problem
   - Identify patterns for optimization
   - Handle edge cases systematically 