package org.example.challenges;


/*
    The main idea is to count all the occurring characters in a string.
    If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
    What if the string is empty? Then the result should be empty object literal, {}.
*/

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for ( int i = 0; i < str.length(); i++ ) {
            if (result.containsKey(str.charAt(i))) {
                result.put(str.charAt(i), result.get(str.charAt(i)) + 1);
            } else {
                result.put(str.charAt(i), 1);
            }
        }
        return result;
    }
}
