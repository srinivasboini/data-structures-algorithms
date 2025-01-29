package com.dsa.strings.validanagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidAnagramTest {

    @Test
    public void testBruteForceApproach() {
        ValidAnagramStrategy strategy = new BruteForceApproach();
        assertTrue(strategy.isAnagram("anagram", "nagaram"));
        assertFalse(strategy.isAnagram("rat", "car"));
    }

    @Test
    public void testSortingApproach() {
        ValidAnagramStrategy strategy = new SortingApproach();
        assertTrue(strategy.isAnagram("anagram", "nagaram"));
        assertFalse(strategy.isAnagram("rat", "car"));
    }

    @Test
    public void testArrayApproach() {
        ValidAnagramStrategy strategy = new ArrayApproach();
        assertTrue(strategy.isAnagram("anagram", "nagaram"));
        assertFalse(strategy.isAnagram("rat", "car"));
    }
} 