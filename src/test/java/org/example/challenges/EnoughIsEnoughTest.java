package org.example.challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EnoughIsEnoughTest {

    @Test
    void testDeleteNthWithValidInput1() {
        int[] input = {1, 2, 3, 1, 2, 1, 2, 3};
        int maxOccurrences = 2;
        int[] expected = {1, 2, 3, 1, 2, 3};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }

    @Test
    void testDeleteNthWithValidInput2() {
        int[] input = {20, 37, 20, 21};
        int maxOccurrences = 1;
        int[] expected = {20, 37, 21};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }

    @Test
    void testDeleteNthWithEmptyArray() {
        int[] input = {};
        int maxOccurrences = 3;
        int[] expected = {};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }

    @Test
    void testDeleteNthWithMaxOccurrencesZero() {
        int[] input = {1, 2, 3, 1, 2, 3};
        int maxOccurrences = 0;
        int[] expected = {};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }

    @Test
    void testDeleteNthWithSingleElementArray() {
        int[] input = {5};
        int maxOccurrences = 1;
        int[] expected = {5};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }

    @Test
    void testDeleteNthWithAllDuplicates() {
        int[] input = {7, 7, 7, 7, 7};
        int maxOccurrences = 3;
        int[] expected = {7, 7, 7};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }

    @Test
    void testDeleteNthWithNegativeOccurrences() {
        int[] input = {1, 2, 3, 4};
        int maxOccurrences = -1;
        int[] expected = {};
        assertArrayEquals(expected, EnoughIsEnough.deleteNth(input, maxOccurrences));
    }
}
