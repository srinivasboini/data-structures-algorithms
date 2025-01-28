package com.dsa.arrays.plusone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit tests for Plus One problem.
 */
public class PlusOneTest {
    
    private final PlusOneStrategy[] solutions = {
        new BruteForceApproach(),
        new OptimalApproach()
    };

    @Test
    public void testPlusOne() {
        for (PlusOneStrategy strategy : solutions) {
            assertArrayEquals(new int[]{1, 0, 0, 0}, strategy.plusOne(new int[]{9, 9, 9}),
                    "Failed for " + strategy.getClass().getSimpleName());
            assertArrayEquals(new int[]{1, 2, 4}, strategy.plusOne(new int[]{1, 2, 3}),
                    "Failed for " + strategy.getClass().getSimpleName());
            assertArrayEquals(new int[]{1, 0}, strategy.plusOne(new int[]{9}),
                    "Failed for " + strategy.getClass().getSimpleName());
        }
    }
} 