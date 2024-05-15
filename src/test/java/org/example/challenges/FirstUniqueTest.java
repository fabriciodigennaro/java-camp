package org.example.challenges;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueTest {

    private final FirstUnique firstUnique = new FirstUnique();

    @Test
    void shouldFindFirstUnique() {
        // Given
         int[] input = {2, 2, 3, 5, 6, 3, 4};
         int expected = 5;

        // When
        Optional<Integer> result = firstUnique.solution(input);

        // Then
        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @Test
    void shouldReturnEmptyOptionalWhenUniqueNotFound() {
        // Given
        int[] input = {2, 2, 3, 3, 6, 6, 4, 4};

        // When
        Optional<Integer> result = firstUnique.solution(input);

        // Then
        assertTrue(result.isEmpty());
    }

    @Test
    @Disabled
    void shouldThrowAnExceptionWhenUniqueNotFound() {
        // Given
        int[] input = {2, 2, 3, 3, 6, 6, 4, 4};

        // When
        // Then
        assertThrows(IllegalArgumentException.class, () -> firstUnique.solution(input));
    }

    @Test
    @Disabled
    void shouldReturnNullWhenUniqueNotFound() {
        // Given
        int[] input = {2, 2, 3, 3, 6, 6, 4, 4};

        // When
        Optional<Integer> result = firstUnique.solution(input);

        // Then
        assertNull(result);
    }


}