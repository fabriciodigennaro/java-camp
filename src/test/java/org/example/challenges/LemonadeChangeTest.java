package org.example.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LemonadeChangeTest {
    private final LemonadeChange lemonadeChange = new LemonadeChange();

    @Test
    void shouldReturnTrueWhenThereIsEnoughChangeForAllCustomers() {
        int[] input = {5,5,5,10,20};
        assertTrue(lemonadeChange.solution(input));
    }

    @Test
    void shouldReturnFalseWhenThereIsNotEnoughChangeForAllCustomers() {
        int[] input = {5,5,10,10,20};
        assertFalse(lemonadeChange.solution(input));
    }

    @Test
    void shouldReturnTrueWhenThereIsEnoughChangeForAllCustomersWithMultipleTwentyBills() {
        int[] input = {5,5,5,5,10,10,20,20};
        assertTrue(lemonadeChange.solution(input));
    }

    @Test
    void shouldReturnTrueWhenThereIsEnoughChangeForAllCustomersWithMultipleTwentyBillsAndNoTens() {
        int[] input = {5,5,5,5,5,5,20,20};
        assertTrue(lemonadeChange.solution(input));
    }

}