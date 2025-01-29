package com.dsa.strings.firstuniquecharacter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterTest {

    @Test
    public void testBruteForceApproach() {
        FirstUniqueCharacterStrategy strategy = new BruteForceApproach();
        assertEquals(0, strategy.firstUniqChar("leetcode"));
        assertEquals(2, strategy.firstUniqChar("loveleetcode"));
        assertEquals(-1, strategy.firstUniqChar("aabb"));
    }

    @Test
    public void testHashMapApproach() {
        FirstUniqueCharacterStrategy strategy = new HashMapApproach();
        assertEquals(0, strategy.firstUniqChar("leetcode"));
        assertEquals(2, strategy.firstUniqChar("loveleetcode"));
        assertEquals(-1, strategy.firstUniqChar("aabb"));
    }

    @Test
    public void testArrayApproach() {
        FirstUniqueCharacterStrategy strategy = new ArrayApproach();
        assertEquals(0, strategy.firstUniqChar("leetcode"));
        assertEquals(2, strategy.firstUniqChar("loveleetcode"));
        assertEquals(-1, strategy.firstUniqChar("aabb"));
    }
} 