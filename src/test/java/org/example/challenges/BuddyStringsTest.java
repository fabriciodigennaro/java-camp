package org.example.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuddyStringsTest {

    private final BuddyStrings buddyStrings = new BuddyStrings();

    @Test
    void shouldReturnTrueWhenMatchAfterSwap() {
        String s = "ab";
        String goal = "ba";
        boolean result = buddyStrings.solution(s, goal);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenMatchAfterSwapAndMultipleCharacters() {
        String s = "abcd";
        String goal = "cbad";
        boolean result = buddyStrings.solution(s, goal);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenNoMatchAfterSwapAndMultipleCharacters() {
        String s = "atcdez";
        String goal = "abcdef";
        boolean result = buddyStrings.solution(s, goal);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenThereIsNoMatchAfterSwap() {
        String s = "ab";
        String goal = "ab";
        boolean result = buddyStrings.solution(s, goal);
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenThereIsNoMatchAfterSwap2() {
        String s = "abc";
        String goal = "abc";
        boolean result = buddyStrings.solution(s, goal);
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenBothStringsAreEqual() {
        String s = "aa";
        String goal = "aa";
        boolean result = buddyStrings.solution(s, goal);
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueWhenBothStringsAreEqual2() {
        String s = "asa";
        String goal = "asa";
        boolean result = buddyStrings.solution(s, goal);
        assertTrue(result);
    }

}