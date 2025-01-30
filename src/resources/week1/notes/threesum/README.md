# 3Sum - Comprehensive Analysis

## Problem Statement
Given an integer array nums, return all unique triplets [nums[i], nums[j], nums[k]] such that i != j != k and nums[i] + nums[j] + nums[k] = 0.

## Constraints
- 3 <= nums.length <= 3000
- -10^5 <= nums[i] <= 10^5

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check all possible triplets using nested loops
- **Time Complexity**: O(n³)
- **Space Complexity**: O(n) for storing unique triplets
- **Pros**: Simple implementation
- **Cons**: Impractical for large inputs

### 2. Optimal Two Pointer Approach
- **Algorithm**:
  1. Sort the array
  2. Iterate through each element as first element
  3. Use two pointers for remaining elements
  4. Skip duplicates to avoid repeated triplets
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1) (excluding output storage)
- **Pros**: Efficient solution with duplicate handling
- **Cons**: Requires sorting modification

## Edge Cases
1. All elements zero: [0,0,0,0]
2. Multiple duplicate triplets
3. All positive/negative numbers
4. Exactly three elements summing to zero
5. Large input with many possible combinations

## Learning Points
- Two pointer technique with sorted arrays
- Duplicate handling strategies
- Trade-offs between time and space complexity
- Importance of sorting for optimization

## Common Mistakes
- Forgetting to sort the array first
- Not properly skipping duplicates
- Incorrect pointer movement logic
- Missing edge cases with all zeros
- Handling empty input arrays

## Interview Tips
1. Start with brute force explanation
2. Derive optimal solution through sorting
3. Visualize the two pointer approach
4. Explain duplicate skipping logic
5. Discuss time/space complexity tradeoffs

## Real-world Applications
- Combinatorial optimization problems
- Financial portfolio balancing
- Chemistry (molecular combinations)
- Data analysis for triplet correlations
- Game development (triple item combinations)

## Problem-Solving Thought Process
**Key insights for optimal approach:**
1. Sorting enables efficient duplicate skipping
2. Fix first element and solve reduced two-sum problem
3. Use two pointers to find complement pairs
4. Skip consecutive duplicates to avoid repeated triplets

**Why this works:**
- Sorting brings duplicates together for easy skipping
- Two pointer technique reduces O(n³) to O(n²)
- Early termination when sum exceeds target
- Systematic exploration of all valid combinations 


Okay, I need to tackle the 3Sum problem. Let's start by understanding the problem. The goal is to find all unique triplets in the array that sum up to zero. The key points are that the solution set must not contain duplicate triplets, and the order of numbers in the triplet doesn't matter.
First, I'll think about the brute force approach. That would involve checking all possible triplets, which is O(n³) time complexity. But with the constraints (n up to 3000), this isn't feasible. So, the optimal approach is needed.
The optimal approach likely involves sorting the array first. Sorting helps in avoiding duplicates and allows the use of two pointers. For each element, I can fix it and then use two pointers to find the other two elements that sum to the negative of the fixed element. This way, the total sum becomes zero.
Wait, but how to avoid duplicates? After sorting, if consecutive elements are the same, I can skip them to prevent duplicate triplets. For example, if nums[i] == nums[i-1], skip nums[i] to avoid processing the same element again.
So the steps would be:
1. Sort the array.
2. Iterate through each element as the first element of the triplet.
3. For each element, use two pointers (left and right) to find pairs that sum to -nums[i].
4. Skip duplicates for the first element and during the two-pointer phase.
Edge cases to consider:
Array with all zeros: [0,0,0,0]
Multiple triplets with the same sum but different indices
Negative and positive numbers that cancel each other out
Testing is crucial. For example, input [-1,0,1,2,-1,-4] should return [[-1,-1,2], [-1,0,1]].
I need to implement this using the strategy pattern as per the project guidelines. The BruteForceApproach would check all triplets, while the OptimalApproach uses sorting and two pointers.
Documentation should include the problem statement, constraints, approaches with time/space complexity, edge cases, and real-world applications. The README should also explain the thought process behind the optimal approach.
I should also handle cases where the same number appears multiple times, ensuring that duplicates are skipped correctly. For example, in the sorted array [-4, -1, -1, 0, 1, 2], when i=1 (nums[i]=-1), since nums[1] == nums[0], we skip to avoid duplicate triplets.
Another thing to consider is that once a triplet is found, the left and right pointers need to be moved past any duplicates to prevent adding the same triplet again.
Time complexity for the optimal approach is O(n²) due to the outer loop and inner two-pointer traversal. Space complexity is O(1) or O(n) depending on the sorting algorithm used (in Java, Arrays.sort() uses a dual-pivot quicksort for primitives with O(log n) space, but for objects, it's a modified mergesort with O(n) space).
I need to make sure the code correctly implements these steps, handles all edge cases, and follows the project structure. The test cases should cover various scenarios, including duplicates, all zeros, and no valid triplets.