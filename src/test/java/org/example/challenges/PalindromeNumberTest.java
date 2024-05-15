package org.example.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void shouldReturnTrueWhenTheNumberIsAPalindrome() {
        assertTrue(palindromeNumber.solution(121));
    }

    @Test
    void shouldReturnTrueWhenTheNumberIsAPalindromeOfOneDigit() {
        assertTrue(palindromeNumber.solution(1));
    }

    @Test
    void shouldReturnFalseWhenTheNumberIsNegative() {
        assertFalse(palindromeNumber.solution(-121));
    }

    @Test
    void shouldReturnFalseWhenTheNumberIsNotPalindrome() {
        assertFalse(palindromeNumber.solution(10));
    }

}