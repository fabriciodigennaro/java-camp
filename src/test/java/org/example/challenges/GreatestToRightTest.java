package org.example.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GreatestToRightTest {
    private final GreatestToRight greatestToRight = new GreatestToRight();

    @Test
    void shouldReturnMinusOneIfTheArrayOnlyHaveOnePosition() {
        int[] input = {400};
        int[] expected = {-1};
        int[] result = greatestToRight.solution(input);

        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnAnArrayOfGreatestNumbersOnTheRight() {
        int[] input = {17, 18, 5, 4, 6, 1};
        int[] expected = {18, 6, 6, 6, 1, -1};
        int[] result = greatestToRight.solution(input);

        assertArrayEquals(expected, result);
    }



}