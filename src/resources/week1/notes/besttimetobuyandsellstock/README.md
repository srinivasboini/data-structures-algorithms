# Best Time to Buy and Sell Stock

## Problem Statement
Given an array `prices` where `prices[i]` is the price of a given stock on the `i-th` day, you want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

## Constraints
- 1 <= prices.length <= 10^5
- 0 <= prices[i] <= 10^4

## Approaches

### Brute Force Approach
- **Algorithm**: Check every pair of days to find the maximum profit.
- **Time Complexity**: O(n^2)
- **Space Complexity**: O(1)
- **Pros**: Simple to implement.
- **Cons**: Inefficient for large inputs.

### Optimal Approach
- **Algorithm**: Track the minimum price and calculate the profit for each day.
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: Efficient and easy to understand.
- **Cons**: None significant.

### Two Pointers Approach
- **Algorithm**: Use two pointers to track potential buy/sell days
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**:
  - Clear pointer-based logic
  - Easy to visualize
- **Cons**: Slightly more variables than minimal optimal solution

## Edge Cases
- Prices are in descending order, resulting in zero profit.
- Prices are constant, resulting in zero profit.

## Learning Points
- Understanding of array traversal and profit calculation.
- Implementation of efficient algorithms.

## Common Mistakes
- Not considering the case where no profit is possible.

## Interview Tips
- Discuss both brute force and optimal solutions.
- Explain the trade-offs between time and space complexity. 