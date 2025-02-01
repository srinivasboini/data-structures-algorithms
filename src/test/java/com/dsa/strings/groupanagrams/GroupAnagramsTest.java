package com.dsa.strings.groupanagrams;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private final GroupAnagramsStrategy[] strategies = {
        new SortedKeyApproach(),
        new CharacterCountApproach()
    };

    @Test
    void testStandardCase() {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = List.of(
            List.of("bat"),
            List.of("nat","tan"),
            List.of("ate","eat","tea")
        );
        assertStrategies(input, expected);
    }

    @Test
    void testEmptyInput() {
        String[] input = {};
        List<List<String>> expected = List.of();
        assertStrategies(input, expected);
    }

    @Test
    void testSingleCharacterStrings() {
        String[] input = {"a", "b", "a"};
        List<List<String>> expected = List.of(
            List.of("a", "a"),
            List.of("b")
        );
        assertStrategies(input, expected);
    }

    private void assertStrategies(String[] input, List<List<String>> expected) {
        for (GroupAnagramsStrategy strategy : strategies) {
            List<List<String>> result = strategy.groupAnagrams(input);
            assertTrue(areEqualIgnoringOrder(expected, result),
                "Failed for " + strategy.getClass().getSimpleName());
        }
    }

    private boolean areEqualIgnoringOrder(List<List<String>> first, List<List<String>> second) {
        if (first.size() != second.size()) return false;
        
        List<Set<String>> firstSets = new ArrayList<>();
        List<Set<String>> secondSets = new ArrayList<>();
        
        for (List<String> group : first) {
            firstSets.add(new HashSet<>(group));
        }
        for (List<String> group : second) {
            secondSets.add(new HashSet<>(group));
        }
        
        return firstSets.containsAll(secondSets) && secondSets.containsAll(firstSets);
    }
} 