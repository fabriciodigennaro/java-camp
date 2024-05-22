package org.example.challenges;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MissingNumberTest {
    private final MissingNumber missingNumber = new MissingNumber();

    @Test
    void shouldReturnMissingNumber() {
        int[] input = {3, 0, 1};
        int expected = 2;

        int result = missingNumber.solution(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnMissingNumberWhenNumberIsLastInRange() {
        int[] input = {0, 1};
        int expected = 2;

        int result = missingNumber.solution(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldReturnMissingNumberWhenNumberIsFirstInRange() {
        int[] input = {2, 1};
        int expected = 0;

        int result = missingNumber.solution(input);

        assertEquals(expected, result);
    }
}