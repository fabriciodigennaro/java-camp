package org.example.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RemoveParenthesesTest {
    @Test
    void testRemoveParentheses() {
        assertEquals("example example", RemoveParentheses.removeParentheses("example (unwanted thing)example"));
        assertEquals("exampleexample", RemoveParentheses.removeParentheses("example(unwanted thing)example"));
        assertEquals("example  example", RemoveParentheses.removeParentheses("example (unwanted thing) example"));
        assertEquals("a e", RemoveParentheses.removeParentheses("a (bc d)e"));
        assertEquals("a", RemoveParentheses.removeParentheses("a(b(c))"));
        assertEquals("hello example  something", RemoveParentheses.removeParentheses("hello example (words(more words) here) something"));
        assertEquals("  ", RemoveParentheses.removeParentheses("(first group) (second group) (third group)"));
    }
}