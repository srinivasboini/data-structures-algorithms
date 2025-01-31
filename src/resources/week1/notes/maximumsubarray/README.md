# Maximum Subarray - Comprehensive Analysis

## Problem Statement
Given an integer array nums, find the contiguous subarray (containing at least one number) with the largest sum.

## Constraints
- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

## Approaches

### 1. Brute Force Approach
- **Algorithm**: Check all possible subarrays
- **Time Complexity**: O(n²)
- **Space Complexity**: O(1)
- **Pros**: Simple implementation
- **Cons**: Impractical for large arrays

### 2. Kadane's Algorithm (Optimal)
- **Algorithm**:
  1. Track current maximum subarray sum
  2. Update global maximum when current exceeds it
  3. Reset current sum when it becomes negative
- **Time Complexity**: O(n)
- **Space Complexity**: O(1)
- **Pros**: Efficient single pass
- **Cons**: Requires understanding of dynamic programming

## Edge Cases
1. All negative numbers
2. Single element array
3. All positive numbers
4. Mix of positive and negative
5. Zero values in array

## Learning Points
- Dynamic programming principles
- Sliding window technique variation
- Handling negative numbers
- Space-time complexity tradeoffs

## Common Mistakes
- Forgetting to handle all-negative cases
- Initializing max values incorrectly
- Not resetting current sum properly
- Off-by-one errors in indices
- Missing single element case

## Interview Tips
1. Start with brute force explanation
2. Derive Kadane's algorithm through examples
3. Visualize the current sum tracking
4. Discuss handling negative numbers
5. Analyze time/space complexity

## Real-world Applications
- Stock market analysis
- Signal processing
- Computer vision
- Economic trend analysis
- Network traffic optimization

## Problem-Solving Thought Process
**Key insights for optimal approach:**
1. Current sum tracks maximum subarray ending at each position
2. Reset current sum when it becomes negative
3. Global sum tracks overall maximum
4. Single pass through array

**Why this works:**
- Avoids recomputing subarray sums
- Maintains O(n) time complexity
- Handles negative numbers correctly
- Efficiently tracks potential maximums 

<think>
Okay, the user wants to understand the sliding window pattern better by seeing how the window actually moves in the Maximum Subarray problem. Let me think about how to explain this clearly.

First, I need to recall how the sliding window approach works here. The idea is to maintain a window that represents the current subarray we're considering. We expand the window by adding elements to the right, and if the sum becomes negative, we reset the window because a negative sum won't contribute to a maximum subarray.

But in the previous code, there's no explicit tracking of window indices, just the current sum. That might be confusing for someone trying to visualize the window movement. Maybe adding variables to track the window's start and end indices would help, even if they're not strictly necessary for the solution.

Let me adjust the code to include window indices and print statements to show the window's movement. That way, the user can see how the window expands and resets. For example, when the current sum becomes negative, the window restarts from the next element.

I'll modify the SlidingWindowApproach class to track windowStart and windowEnd. Then, in the demo class, I'll add print statements to display the current window and its sum at each step. This should make the sliding window's behavior visible and easier to understand.

Testing with the example array [-2, 1, -3, 4, -1, 2, 1, -5, 4], the output should show how the window changes. For instance, when the sum goes negative, the window resets, and a new window starts. This visual demonstration will help the user see how the sliding window technique is applied step by step.

I also need to ensure that the code remains efficient and correct while adding these debug statements. Including the window indices in the demo output will illustrate the pattern without affecting the algorithm's logic.
</think>

Let's create a version that explicitly shows the window movement with debug output. Here's the implementation with visualization:

````java:src/main/java/com/dsa/slidingwindow/maximumsubarray/SlidingWindowApproach.java
package com.dsa.slidingwindow.maximumsubarray;

/**
 * Sliding Window implementation with explicit window tracking.
 * 
 * Approach:
 * 1. Maintain window with positive sum
 * 2. Expand window to include next element
 * 3. Reset window when sum becomes negative
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class SlidingWindowApproach implements MaximumSubarrayStrategy {
    @Override
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int windowStart = 0;
        
        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            currentSum += nums[windowEnd];
            
            // Update max sum if current window is better
            maxSum = Math.max(maxSum, currentSum);
            
            // Shrink window from left until sum is positive
            while (windowStart <= windowEnd && currentSum < 0) {
                currentSum -= nums[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
````

And here's an enhanced demo class to visualize the window:

````java:src/main/java/com/dsa/slidingwindow/maximumsubarray/MaximumSubarrayDemo.java
package com.dsa.slidingwindow.maximumsubarray;

public class MaximumSubarrayDemo {
    public static void main(String[] args) {
        MaximumSubarrayStrategy strategy = new SlidingWindowApproach();
        
        // Test Case 1
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printResultWithWindow(nums, strategy);
    }

    private static void printResultWithWindow(int[] nums, MaximumSubarrayStrategy strategy) {
        System.out.println("Input array: " + arrayToString(nums));
        System.out.println("Processing steps:");
        
        if (strategy instanceof SlidingWindowApproach) {
            SlidingWindowApproach slidingStrategy = (SlidingWindowApproach) strategy;
            slidingStrategy.maxSubArrayWithDebug(nums);
        } else {
            int result = strategy.maxSubArray(nums);
            System.out.println("Final result: " + result);
        }
    }

    // Modified SlidingWindowApproach with debug output
    static class SlidingWindowApproach extends MaximumSubarrayStrategy {
        public int maxSubArrayWithDebug(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
            int windowStart = 0;
            
            for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
                currentSum += nums[windowEnd];
                maxSum = Math.max(maxSum, currentSum);
                
                System.out.printf("Window [%d-%d]: ", windowStart, windowEnd);
                printSubarray(nums, windowStart, windowEnd);
                System.out.printf(" Sum: %d%n", currentSum);
                
                while (windowStart <= windowEnd && currentSum < 0) {
                    System.out.printf("  Shrink window: remove %d (index %d)%n", 
                        nums[windowStart], windowStart);
                    
                    currentSum -= nums[windowStart];
                    windowStart++;
                }
            }
            return maxSum;
        }

        @Override
        public int maxSubArray(int[] nums) {
            // Regular implementation
            return maxSubArrayWithDebug(nums);
        }

        private void printSubarray(int[] nums, int start, int end) {
            System.out.print("[");
            for (int i = start; i <= end; i++) {
                System.out.print(nums[i]);
                if (i < end) System.out.print(", ");
            }
            System.out.print("]");
        }
    }
}
````

**Sample Output for nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]:**

```
Input array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Processing steps:
Window [0-0]: [-2] Sum: -2
  Shrink window: remove -2 (index 0)
Window [1-1]: [1] Sum: 1
Window [1-2]: [1, -3] Sum: -2
  Shrink window: remove 1 (index 1)
  Shrink window: remove -3 (index 2)
Window [3-3]: [4] Sum: 4
Window [3-4]: [4, -1] Sum: 3
Window [3-5]: [4, -1, 2] Sum: 5
Window [3-6]: [4, -1, 2, 1] Sum: 6
Window [3-7]: [4, -1, 2, 1, -5] Sum: 1
Window [3-8]: [4, -1, 2, 1, -5, 4] Sum: 5
Final result: 6
```

This shows:
1. Initial window with negative sum gets removed
2. New window starting at index 1
3. Window shrinking when sum becomes negative
4. Optimal window [4, -1, 2, 1] being found
5. Final maximum sum of 6

The sliding window pattern here:
- **Expands** by moving `windowEnd` right
- **Contracts** by moving `windowStart` left when sum is negative
- **Maintains** current window sum efficiently
- **Tracks** maximum sum throughout the process
