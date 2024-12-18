package org.example.challenges;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TickerTest {
    @Test
    @DisplayName("Empty display as the initial state")
    void emptyDisplayInitialState() {
        assertEquals("          ", Ticker.ticker("Hello", 10, 0));
    }

    @Test
    @DisplayName("Show first characters from right to left")
    void showFirstCharactersRightToLeft() {
        assertEquals("         H", Ticker.ticker("Hello", 10, 1));
        assertEquals("        He", Ticker.ticker("Hello", 10, 2));
        assertEquals("       Hel", Ticker.ticker("Hello", 10, 3));
    }

    @Test
    @DisplayName("Fill the window with text")
    void fillWindowWithText() {
        assertEquals("Hello     ", Ticker.ticker("Hello", 10, 40));
        assertEquals("ello      ", Ticker.ticker("Hello", 10, 11));
    }

    @Test
    @DisplayName("Fill the window with spaces when text is exhausted")
    void fillWindowWithSpaces() {
        assertEquals("          ", Ticker.ticker("Hi", 10, 12));
    }

    @Test
    @DisplayName("Fit short text in window")
    void fitShortTextInWindow() {
        assertEquals("Hi        ", Ticker.ticker("Hi", 10, 10));
        assertEquals("i         ", Ticker.ticker("Hi", 10, 11));
    }

    @Test
    @DisplayName("Work with extra narrow window")
    void workWithExtraNarrowWindow() {
        assertEquals(" ", Ticker.ticker("Hello", 1, 0));
        assertEquals("H", Ticker.ticker("Hello", 1, 1));
        assertEquals("e", Ticker.ticker("Hello", 1, 2));
    }

    @Test
    @DisplayName("Full cycle scrolling")
    void fullCycleScrolling() {
        String text = "Test";
        int width = 5;
        int cycleLength = text.length() + width;

        for (int tick = 0; tick < cycleLength * 2; tick++) {
            String result = Ticker.ticker(text, width, tick);
            assertEquals(width, result.length());
        }
    }

    @Test
    @DisplayName("Edge case: Very large tick values")
    void edgeCaseLargeTick() {
        String text = "Edge case test";
        int width = 10;
        int tick = 1_000_000;

        String result = Ticker.ticker(text, width, tick);
        assertNotNull(result);
        assertEquals(width, result.length());
    }
}