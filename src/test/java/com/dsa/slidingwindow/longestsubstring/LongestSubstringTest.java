package com.dsa.slidingwindow.longestsubstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {
    private final LongestSubstringStrategy[] strategies = {
        new BruteForceApproach(),
        new SlidingWindowApproach()
    };

    @Test
    void testStandardCase() {
        String input = "abcabcbb";
        int expected = 3;
        assertStrategies(input, expected);
    }

    @Test
    void testAllUnique() {
        String input = "abcdef";
        int expected = 6;
        assertStrategies(input, expected);
    }

    @Test
    void testRepeatingCharacters() {
        String input = "abba";
        int expected = 2;
        assertStrategies(input, expected);
    }

    @Test
    void testEdgeCases() {
        assertStrategies("", 0);
        assertStrategies(null, 0);
        assertStrategies(" ", 1);
        assertStrategies("  ", 1);  // Test multiple spaces
        assertStrategies("au", 2); // Test two unique characters
    }

    private void assertStrategies(String input, int expected) {
        for (LongestSubstringStrategy strategy : strategies) {
            assertEquals(expected, strategy.lengthOfLongestSubstring(input),
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 