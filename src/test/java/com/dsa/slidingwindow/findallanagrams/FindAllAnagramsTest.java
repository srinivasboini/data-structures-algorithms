package com.dsa.slidingwindow.findallanagrams;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllAnagramsTest {
    private final FindAllAnagramsStrategy[] strategies = {
        new BruteForceApproach(),
        new SlidingWindowApproach()
    };

    @Test
    void testStandardCase() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> expected = List.of(0, 6);
        assertStrategies(s, p, expected);
    }

    @Test
    void testNoAnagrams() {
        String s = "abcdefg";
        String p = "xyz";
        List<Integer> expected = List.of();
        assertStrategies(s, p, expected);
    }

    @Test
    void testAllAnagrams() {
        String s = "abab";
        String p = "ab";
        List<Integer> expected = List.of(0, 1, 2);
        assertStrategies(s, p, expected);
    }

    private void assertStrategies(String s, String p, List<Integer> expected) {
        for (FindAllAnagramsStrategy strategy : strategies) {
            assertEquals(expected, strategy.findAnagrams(s, p),
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 