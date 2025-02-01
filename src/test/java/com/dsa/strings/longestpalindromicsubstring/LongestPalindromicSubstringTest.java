package com.dsa.strings.longestpalindromicsubstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Longest Palindromic Substring implementations.
 * Contains test cases for both brute force and optimal approaches.
 */
class LongestPalindromicSubstringTest {
    // Test both implementations
    private final LongestPalindromicSubstringStrategy[] strategies = {
        new BruteForceApproach(),
        new ExpandCenterApproach(),
        new ManacherApproach(),
        new DynamicProgrammingApproach()
    };

    @Test
    void testStandardCase() {
        String input = "babad";
        // There can be multiple valid outputs ("bab" or "aba")
        String[] possibleOutputs = {"bab", "aba"};
        assertStrategies(input, possibleOutputs);
    }

    @Test
    void testEvenLengthPalindrome() {
        String input = "cbbd";
        String expected = "bb";
        assertStrategies(input, new String[]{expected});
    }

    @Test
    void testSingleCharacter() {
        String input = "a";
        String expected = "a";
        assertStrategies(input, new String[]{expected});
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertStrategies(input, new String[]{expected});
    }

    /**
     * Helper method to test all strategies
     * @param input Test input string
     * @param possibleExpected Array of acceptable outputs
     */
    private void assertStrategies(String input, String[] possibleExpected) {
        for (LongestPalindromicSubstringStrategy strategy : strategies) {
            String result = strategy.longestPalindrome(input);
            assertTrue(isValidResult(result, possibleExpected),
                "Strategy: " + strategy.getClass().getSimpleName() + 
                "\nInput: " + input + 
                "\nExpected one of: " + String.join(", ", possibleExpected) +
                "\nActual: " + result);
        }
    }
    
    /**
     * Validates if result matches any of the expected possibilities
     */
    private boolean isValidResult(String result, String[] possible) {
        for (String s : possible) {
            if (s.equals(result)) return true;
        }
        return false;
    }
} 