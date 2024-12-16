package org.example.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToTextTest {
    @Test
    void testHello() {
        assertEquals(
            "Hello",
            BinaryToText.binaryToText("0100100001100101011011000110110001101111"));
    }

    @Test
    void testEmptyString() {
        assertEquals(
            "",
            BinaryToText.binaryToText(""));
    }

}